package com.alejandroem.JSON_DB_Bridge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alejandroem.JSON_DB_Bridge.service.JsonDbBridgeService;

@RestController
@RequestMapping("/api")
public class JsonDbBridgeController {

	@Autowired
	private JsonDbBridgeService jsonDbBridgeService;

	@GetMapping("/json")
	public ResponseEntity<String> doTask() {
		jsonDbBridgeService.doTask();
		return new ResponseEntity<>("Hello World!", HttpStatus.OK);
//		ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);
//		return responseEntity;
	}

}
