package com.student.app.service;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class CitiesService {

	private RestTemplate restTemplate = new RestTemplate();
	
	Logger log = LoggerFactory.getLogger(CitiesService.class);
	
	private final String AUTH = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyIjp7InVzZXJfZW1haWwiOiJhYXJ5YW5jaGF1YmV5NjkzQGdtYWlsLmNvbSIsImFwaV90b2tlbiI6Iks0elNuU2RsNzNCMmFTLVpNdTQ2aGdtaGNFd3BHaHp6NFVwZHpCUHk3OF9Ca3lMZklQUE5DRmJ2SW9KRXhBN3dweGMifSwiZXhwIjoxNjQwOTY2ODEwfQ.Iw7yTAWSKPu_7xvEAtseFS-3eQ56FvyPiHXawauIISI";	
	
	public List<Object> getCities(String state) throws RestClientException, URISyntaxException{
		
		log.info("entering get cities - ");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setBearerAuth(AUTH);
		HttpEntity<String> entity = new HttpEntity<>("body", headers);

		
		ResponseEntity<Object[]> data =  restTemplate.exchange("https://www.universal-tutorial.com/api/cities/"+state, HttpMethod.GET, entity, Object[].class);
		
		log.info("get response - "+data.getBody().toString());
		List<Object> listofCities = new ArrayList<>(Arrays.asList(data.getBody()));
//		
		return listofCities;
	}
}
