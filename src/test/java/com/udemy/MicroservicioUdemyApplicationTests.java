package com.udemy;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc //is of spring
@TestMethodOrder(OrderAnnotation.class) //the tests are shown by order
class MicroservicioUdemyApplicationTests {

	@Autowired
	MockMvc mock;
	
	@Test
	@Order(1)
	void getGreetingJSONTest() throws Exception {
		mock.perform(get("/greeting/json/jdoe")).andDo(print());
	}
	
	@Test
	@Order(0)
	void getGreetingXMLTest() throws Exception {
		mock.perform(get("/greeting/xml/Jhon")).andDo(print());
	}
	
	
//	@Test
//	@Order(3)
//	void postExampleTest() throws Exception {
//		mock.perform(post("/greeting/xml/Jhon")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content("{\"nombre\":\"exampleName\"}")
//				).andDo(print());
//	}
	
	
	
}
