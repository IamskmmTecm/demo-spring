package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

@RestController
public class TestClass {
	
	@Autowired
	private Businesss business;
	
	@GetMapping("/test")
	public List<DataService> getTestMsg() {
		System.out.println("------------------------in  controller");
		return business.getData();
	}
	
	
	@GetMapping("/test/{itemId}")
	public List<DataService> getTestById(@PathVariable int itemId){
		
		return business.getData().stream().filter(e-> e.getId()==itemId).collect(Collectors.toList());
	}
	
	@PostMapping("/test")
	public void addData(@RequestBody DataService e) {
		System.out.println(e);
		 business.postData(e);
	}
	
	@PutMapping("/test")
	public void updateValue(@RequestBody DataService e) {
		business.updateValue(e);
	}
	
//	@putmapp
//	public void deleteValue(int id) {
//		
//	}

}
