package com.student.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.student.app.entity.Address;
import com.student.app.entity.StudentInfo;
import com.student.app.models.StudentPOJO;
import com.student.app.repositories.AddressRepository;
import com.student.app.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AddressRepository addressRepository;

//	public void addStudent(Map<String,String>[] stud) {
//		// TODO Auto-generated method stub
//		StudentInfo studentInfo = new StudentInfo();
//		List<Map<String,String>> students = new ArrayList<>(Arrays.asList(stud));
//		
//		students.stream().filter(x -> x.get("name").equals("firstname")).findAny().orElse(null).get("value");
//		
//		Address address = new Address();
//		address.setCountry(students.stream().filter(x -> x.get("name").equals("country")).findAny().orElse(null).get("value"));
//		address.setState(students.stream().filter(x -> x.get("name").equals("state")).findAny().orElse(null).get("value"));
//		address.setCity(students.stream().filter(x -> x.get("name").equals("city")).findAny().orElse(null).get("value"));
//		
//		studentInfo.setFirstname(students.stream().filter(x -> x.get("name").equals("firstname")).findAny().orElse(null).get("value"));
//		studentInfo.setLastname(students.stream().filter(x -> x.get("name").equals("lastname")).findAny().orElse(null).get("value"));
//		studentInfo.setContact(Long.parseLong(students.stream().filter(x -> x.get("name").equals("contact")).findAny().orElse(null).get("value")));
//		studentInfo.setEmail(students.stream().filter(x -> x.get("name").equals("email")).findAny().orElse(null).get("value"));
//		
//		studentInfo.setAddress(addressRepository.save(address));
//		studentRepository.save(studentInfo);
//	}

	public void addStudent(StudentPOJO student) {
		
		StudentInfo stud = new StudentInfo();
		Address place = new Address();
		
		place.setCity(student.getCity());
		place.setState(student.getState());
		place.setCountry(student.getCountry());
		
		stud.setFirstname(student.getFirstname());
		stud.setLastname(student.getLastname());
		stud.setContact(student.getContact());
		stud.setEmail(student.getEmail());
		stud.setAddress(addressRepository.save(place));
		
		studentRepository.save(stud);	
	}

	public void updateStudent(StudentPOJO update, Long id) {
		
		StudentInfo updateStudent = studentRepository.findById(id).get();
		Address address = addressRepository.findById(id).get();
		
		address.setCity(update.getCity());
		address.setState(update.getState());
		address.setCountry(update.getCountry());
		address.setId(updateStudent.getAddress().getId());
		
		updateStudent.setFirstname(update.getFirstname());
		updateStudent.setLastname(update.getLastname());
		updateStudent.setContact(update.getContact());
		updateStudent.setEmail(update.getEmail());
		updateStudent.setAddress(addressRepository.save(address));
		
		studentRepository.save(updateStudent);	
	
	}

	public void deleteStudent(StudentPOJO delete, Long id) {
		
		studentRepository.deleteById(id);
		
	}

}
