package com.junit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitController {
	
	@GetMapping("/get")
	public String getString() {
		return "null";
	}
}
