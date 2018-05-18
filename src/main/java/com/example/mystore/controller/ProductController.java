package com.example.mystore.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.mystore.model.Product;

@Controller
public class ProductController {

	public static final String HOST = "http://localhost:8090";
	private RestTemplate restTemplate = new RestTemplate();

	@RequestMapping(path = "/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		String uri = HOST + "/rest/product/";
		ResponseEntity<List<Product>> productResponse = restTemplate.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> listProduct = productResponse.getBody();
		modelAndView.addObject("products", listProduct);
		return modelAndView;
	}

	@GetMapping("/products")
	public String listarProdutos(ModelMap model) {
		String uri = HOST + "/rest/product/";
		ResponseEntity<List<Product>> productResponse = restTemplate.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> listProduct = productResponse.getBody();
		model.addAttribute("products", listProduct);
		return "products :: listProductfragment";
	}

	@GetMapping("/product/filter/{venue}")
	public String listarPorFiltro(@PathVariable String venue, ModelMap model) {
		String uri = HOST + "/rest/product/filter/" + venue;
		ResponseEntity<List<Product>> productResponse = restTemplate.exchange(uri, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> listProduct = productResponse.getBody();
		model.addAttribute("products", listProduct);
		return "products :: listProductfragment";
	}

	@GetMapping("/product/detail/{id}")
	public String exibeDetalhesModal(@PathVariable String id, ModelMap model) {
		String uri = HOST + "/rest/product/" + new Long(id);
		Product product = restTemplate.getForObject(uri, Product.class);
		model.addAttribute("product", product);
		return "products :: modalContents";
	}
 
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, String> errorResponse(Exception ex, HttpServletResponse response) {
		Map<String, String> errorMap = new HashMap<String, String>();
		errorMap.put("errorMessage", ex.getMessage());
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		ex.printStackTrace(pw);
		String stackTrace = sw.toString();
		errorMap.put("errorStackTrace", stackTrace);
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		return errorMap;
	}

}
