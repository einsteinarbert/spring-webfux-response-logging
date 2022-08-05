package com.javainuse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

	@GetMapping("/message")
	public String test(@RequestHeader("first-request") String header) {
		System.out.println(header);
		return "Hello JavaInUse Called in First Service";
	}

	@PostMapping("/message1")
	public String testPost(@RequestHeader("first-request") String header) {
		System.out.println(header);
		return "Hello JavaInUse Called in First Service";
	}

	@PostMapping("/message2")
	public void testPostVoid(@RequestHeader("first-request") String header) {
		System.out.println(header);
	}
}
