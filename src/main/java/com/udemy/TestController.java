package com.udemy;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1> Example of controllers </h1>
 * 
 * @author cristobalr1309@gmail.com
 * @version 1.0
 * @since 2023-12-17
 */
@RestController
public class TestController {

	// <<--Return text-->>
	@GetMapping(value = "greeting/text", produces = MediaType.TEXT_PLAIN_VALUE)
	public String testTextController() {
		return "Hello World!";
	}

	// <<--Return XML-->>
	@GetMapping(value = "greeting/xml/{name}", produces = MediaType.APPLICATION_XML_VALUE)
	public String testXMLController(@PathVariable("name") String username) {
		return "Hello " + username;
	}

	// <<-- Return JSON -->>
	@GetMapping(value = "greeting/json/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String testJSONController(@PathVariable String name) {
		return "Hello " + name;
	}
}
