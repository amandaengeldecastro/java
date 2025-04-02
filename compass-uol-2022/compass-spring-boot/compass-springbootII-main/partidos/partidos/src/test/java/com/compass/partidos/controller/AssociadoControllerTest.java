package com.compass.partidos.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.compass.partidos.modelo.Associado;
import com.compass.partidos.modelo.Partido;

public class AssociadoControllerTest extends AbstractTest{
			@Test
			   public void getPartido() throws Exception {
			      String uri = "/associados";
			      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
			         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
			      
			      int status = mvcResult.getResponse().getStatus();
			      assertEquals(200, status);    
			   }
			
			   @Test
			   public void cadastrarProduto() throws Exception {
			      String uri = "/associados";
			      Associado associado = new Associado();
			      associado.setNomeAssociado("Luiz Inácio da Silva");
			      String inputJson = super.mapToJson(associado);
			      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
			         .contentType(MediaType.APPLICATION_JSON_VALUE)
			         .content(inputJson)).andReturn();
			      
			      int status = mvcResult.getResponse().getStatus();
			      assertEquals(201, status);
			      String content = mvcResult.getResponse().getContentAsString();
			      assertEquals(content, "Associado cadastrado com sucesso");
			   }
			   @Test
			   public void atualizarAssociado() throws Exception {
			      String uri = "/associados/1";
			      Partido partido = new Partido();
			      partido.setNomePartido("Bolsonaro");
			      String inputJson = super.mapToJson(partido);
			      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
			         .contentType(MediaType.APPLICATION_JSON_VALUE)
			         .content(inputJson)).andReturn();
			      
			      int status = mvcResult.getResponse().getStatus();
			      assertEquals(200, status);
			      String content = mvcResult.getResponse().getContentAsString();
			      assertEquals(content, "Associado atualizado com sucesso");
			   }
			   @Test
			   public void deletarPartido() throws Exception {
			      String uri = "/associados/1";
			      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
			      int status = mvcResult.getResponse().getStatus();
			      assertEquals(200, status);
			      String content = mvcResult.getResponse().getContentAsString();
			      assertEquals(content, "Product is deleted successsfully");
			   }
			   }
