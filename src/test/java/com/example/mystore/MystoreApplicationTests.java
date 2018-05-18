package com.example.mystore;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.mystore.model.Product;
import com.example.mystore.service.ProductService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MystoreApplicationTests {

	@Autowired
	private ProductService service;

	@Autowired
	private WebApplicationContext wac;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		DefaultMockMvcBuilder builder = MockMvcBuilders.webAppContextSetup(this.wac);
		this.mockMvc = builder.build();
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void testObterTodos() throws Exception {
		List<Product> products = service.obterTodos();
		assertTrue(products.size() > 5);
	}

	@Test
	public void testObterPorId() throws Exception {
		ResultMatcher expected = MockMvcResultMatchers.jsonPath("id").value("8796093054977");

		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/rest/product/8796093054977")
				.accept(MediaType.APPLICATION_JSON);
		this.mockMvc.perform(builder).andExpect(expected);

	}

}
