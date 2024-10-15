package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class Businesss {

//	@Autowired
//	private DataService dataserv;

	private List<DataService> dataList = dataList = new ArrayList<DataService>(
			Arrays.asList(new DataService(1, "Sumit Marik", 350000), new DataService(2, "Sujit Maity", 31111122),
					new DataService(3, "Sonali Bashak", 60000)));;

	public List<DataService> getData() {
		return dataList;
	}

	public void postData(DataService e) {
		System.out.println("Business called=============");
		getData().add(new DataService(e.getId(), e.getName(), e.getSalary()));
	}

	public void updateValue(DataService e) {
		int index = 0;
	for(DataService i:getData()) {
		if(i.getId()==e.getId())
			index++;
	}
		getData().set(index, new DataService(e.getId(), e.getName(), e.getSalary()));

	}
}
