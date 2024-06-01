package com.alejandroem.JSON_DB_Bridge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alejandroem.JSON_DB_Bridge.service.JsonDbBridgeService;

@Service
public class JsonDbBridgeServiceImpl implements JsonDbBridgeService {


    @Autowired
    private RestTemplate restTemplate;
	
	@Override
	public void doTask() {
		String apiUrl = "https://dummyjson.com/quotes";
		restTemplate.getForEntity(apiUrl, String.class); //Return status code

	}

}
