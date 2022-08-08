package com.student.app.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.student.app.models.CountriesPOJO;
import com.student.app.models.CountryPOJO;

@Service
public class CountryService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	Logger log = LoggerFactory.getLogger(CountryService.class);
	
	public List<String> getCountries() throws RestClientException, URISyntaxException{
		
		log.info("entering get countries - ");
		ResponseEntity<CountriesPOJO> entity =  restTemplate.getForEntity(new URI("https://api.first.org/data/v1/countries"), CountriesPOJO.class);
		CountriesPOJO countriesPOJO = entity.getBody();
		
//		List<CountryPOJO> countryPOJO = ;
		List<String> listofCountries = new ArrayList<CountryPOJO>(countriesPOJO.getData().values()).stream().map(x -> x.getCountry()).toList();
		
		log.info("get response - "+listofCountries);
		return listofCountries;
	}
	

}
