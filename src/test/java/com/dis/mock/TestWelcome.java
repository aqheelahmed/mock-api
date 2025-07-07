package com.dis.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.dis.mock.controller.WelcomeController;
import com.dis.mock.service.WelcomeService;

@WebMvcTest(value = WelcomeController.class)
public class TestWelcome {
	
	@MockBean
	private WelcomeService welcomeService; // hello puja
	
	@Autowired
	private MockMvc mockMvc;


	@Test
	public void testWelcome() throws Exception {
		when(welcomeService.sendWelcome()).thenReturn("welcome to aqheel house");
		
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult andReturn = mockMvc.perform(builder).andReturn();
		
		MockHttpServletResponse response = andReturn.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
	}

}
