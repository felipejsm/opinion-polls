package com.polls.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollsController {

	@GetMapping("/")
	public String polls() {
		return "Hello";
	}
}
