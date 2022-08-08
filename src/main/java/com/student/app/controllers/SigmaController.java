package com.student.app.controllers;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.student.app.entity.StudentInfo;
import com.student.app.models.StudentPOJO;
import com.student.app.repositories.StudentRepository;
import com.student.app.service.CitiesService;
import com.student.app.service.CountryNewService;
import com.student.app.service.CountryService;
import com.student.app.service.StateService;
import com.student.app.service.StudentService;

@RestController
@RequestMapping("/api")
public class SigmaController {
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryNewService countryNewService;
	
	@Autowired
	private CitiesService cityService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentRepository studentRepository;
	
//	@GetMapping("/country1")
//	public ResponseEntity<List<String>> getCountry() throws RestClientException, URISyntaxException{
//		
//		List<String> listofcountry = countryService.getCountries();
//		return new ResponseEntity<>(listofcountry,HttpStatus.OK);
//		
//	}
	
	@GetMapping("/states/{country}")
	public ResponseEntity<List<Object>> getState(@PathVariable String country) throws RestClientException, URISyntaxException{
		
		List<Object> listofstate = stateService.getStates(country);
		return new ResponseEntity<>(listofstate,HttpStatus.OK);
		
	}
	
	@GetMapping("/country")
	public ResponseEntity<List<Object>> getCountryNew() throws RestClientException, URISyntaxException{
		
		List<Object> listofcountry = countryNewService.getCountryNew();
		return new ResponseEntity<>(listofcountry,HttpStatus.OK);
		
	}
	
	@GetMapping("/cities/{state}")
	public ResponseEntity<List<Object>> getCities(@PathVariable String state) throws RestClientException, URISyntaxException{
		
		List<Object> listofcities = cityService.getCities(state);
		return new ResponseEntity<>(listofcities,HttpStatus.OK);
		
	}
	
//	@PostMapping("/addStudent")
//	public void addStudent(@RequestBody Map<String, String>[]  stud) {
//		
//		System.out.println(stud);
//		studentService.addStudent(stud);
//	}
	
	@PostMapping("/addStud")
	public void addStud(@RequestBody StudentPOJO student) {
		studentService.addStudent(student);
	}
	
	@GetMapping("/studentinfo")
	public ResponseEntity<List<StudentInfo>> getStudents() throws RestClientException, URISyntaxException{
		
		return new ResponseEntity<>(studentRepository.findAll(),HttpStatus.OK);
		
	}
	
	@PutMapping("/updateStud/{id}")
	public void updateStud(@PathVariable Long id, @RequestBody StudentPOJO update) {
		studentService.updateStudent(update,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable Long id, @RequestBody StudentPOJO delete) {
		studentService.deleteStudent(delete,id);
	}
	
}
