package com.openshift.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class OcpController {

	
	@GetMapping(value = "/api/ocp", produces = "application/json")
	public String getOcp() {
		return "{\"id\": 77777}";
	}
}
