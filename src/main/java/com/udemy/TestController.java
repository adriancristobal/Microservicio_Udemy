package com.udemy;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * <h1> Example of controllers </h1>
 * 
 * @author cristobalr1309@gmail.com
 * @version 1.0
 * @since 17/12/2023
 */
@RestController
public class TestController {

	//<<-- Return text -->>
	@GetMapping(value = "greeting/text", produces = MediaType.TEXT_PLAIN_VALUE)
	public String testTextController() {
		return "Hello World!";
	}
	
	//<<-- Return XML -->>
	// If you use a class model in the @RequestParam, you have to anotate that class with @JacksonXmlRootElement or @XmlRootElement( (i dont remember)
	@GetMapping(value = "greeting/xml/{name}", produces = MediaType.APPLICATION_XML_VALUE)
	public String testXMLController(@PathVariable("name") String username) {
		return "Hello " + username;
	}
	
	//<<-- Return JSON -->>
	@GetMapping(value = "greeting/json/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String testJSONController(@PathVariable String name) {
		return "Hello " + name;
	}
}
