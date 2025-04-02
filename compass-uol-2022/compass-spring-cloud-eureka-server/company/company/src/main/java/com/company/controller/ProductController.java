package com.company.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.company.controller.dto.ProductDto;
import com.company.controller.form.ProductForm;
import com.company.model.Product;
import com.company.repository.ProductRepository;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductRepository pRepository;

	@PostMapping
	@Transactional
	@CacheEvict(value = "product", allEntries = true)
	public ResponseEntity<ProductDto> registerProduct(@RequestBody @Valid ProductForm form,
			UriComponentsBuilder uriBuilder) {

		Product product = form.converter(form);
		pRepository.save(product);

		URI uri = uriBuilder.path("/register/{id}").buildAndExpand(product.getId()).toUri();
		return ResponseEntity.created(uri).body(new ProductDto(product));

	}

	@GetMapping
	@Transactional
	@Cacheable(value = "product")
	public Page<ProductDto> list(
			@PageableDefault(sort = "id", direction = Direction.ASC, page = 0, size = 10) Pageable paginacao) {

		Page<Product> products = pRepository.findAll(paginacao);
		return ProductDto.converter(products);

	}

	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "product", allEntries = true)
	public ResponseEntity<ProductDto> update(@PathVariable Long id, @RequestBody @Valid ProductForm form) {

		Optional<Product> optional = pRepository.findById(id);
		if (optional.isPresent()) {
			Product product = optional.get();
			Product productAtualizado  = form.update(product);
			return ResponseEntity.ok(new ProductDto(productAtualizado));
		}
		return ResponseEntity.notFound().build();	
	}

	@DeleteMapping("/delet/{id}")
	@Transactional
	@CacheEvict(value = "product", allEntries = true)
	public ResponseEntity<?> remover(@PathVariable Long id) {
		Optional<Product> optional = pRepository.findById(id);
		if (optional.isPresent()) {
			pRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}

		return ResponseEntity.notFound().build();
	}
}
