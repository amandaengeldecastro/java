package com.compass.partidos.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.compass.partidos.modelo.Partido;


public class PartidoControllerTest extends AbstractTest{
	@Test
	   public void getPartido() throws Exception {
	      String uri = "/partidos";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);    
	   }
	
	   @Test
	   public void cadastrarPartido() throws Exception {
	      String uri = "/partidos";
	      Partido partido = new Partido();
	      partido.setNomePartido("Partido Democrata");
	      String inputJson = super.mapToJson(partido);
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
	         .contentType(MediaType.APPLICATION_JSON_VALUE)
	         .content(inputJson)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(201, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertEquals(content, "Partido cadastrado com sucesso");
	   }
	   @Test
	   public void atualizarPartido() throws Exception {
	      String uri = "/partidos/1";
	      Partido partido = new Partido();
	      partido.setNomePartido("Psol");
	      String inputJson = super.mapToJson(partido);
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri)
	         .contentType(MediaType.APPLICATION_JSON_VALUE)
	         .content(inputJson)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertEquals(content, "Partido atualizado com sucesso");
	   }
	   @Test
	   public void deletarPartido() throws Exception {
	      String uri = "/partido/1";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri)).andReturn();
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      assertEquals(content, "Product is deleted successsfully");
	   }
}