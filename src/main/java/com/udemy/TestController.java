package com.udemy;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String testController() {
		return "Hola test";
	}
}
