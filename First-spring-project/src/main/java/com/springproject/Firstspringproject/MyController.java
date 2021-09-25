package com.springproject.Firstspringproject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value"/get-message")
	public string getmessage() {

		return"hello";

		}
	}
