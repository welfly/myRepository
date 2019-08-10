package com.tony.spring.boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping(value="/say3", method=RequestMethod.GET)
	public String sayHi() {
		return "Hello SpringBoot33333!";
	}
}
