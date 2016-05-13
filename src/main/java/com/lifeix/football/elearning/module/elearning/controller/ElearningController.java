package com.lifeix.football.elearning.module.elearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/elearnings")
public class ElearningController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String get() {
		return "elearnings" ;
	}
	
}
