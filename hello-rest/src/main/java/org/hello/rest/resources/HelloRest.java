package org.hello.rest.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	
	@GetMapping("/hello")
	public String ping() {
		return "Hello!";
	}
	
}
