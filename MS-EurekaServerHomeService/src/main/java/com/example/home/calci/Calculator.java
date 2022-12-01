package com.example.home.calci;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	@RequestMapping(value="/calci",method=RequestMethod.GET)
	public String add() {
		return "Hai";
	}
}