package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //ready for use by Spring MVC to handle web requests.
public class HelloController {

	@GetMapping("/") //maps / to the index() method. When invoked from a browser or by using curl on the command line, the method returns pure text.
	public String index() {
		return "Greetings from Spring Boot!";
	}

}

// @RestController combines @Controller and @ResponseBody, two annotations that results in web requests returning data rather than a view.