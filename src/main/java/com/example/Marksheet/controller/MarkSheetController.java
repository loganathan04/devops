package com.example.Marksheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import com.example.Marksheet.entity.MarkSheet;
import com.example.Marksheet.service.MarkSheetService;

@RestController
@RequestMapping("/marksheet")
public class MarkSheetController {
	@Autowired
	MarkSheetService markser;
	RestTemplate rt=new RestTemplate();
	@PostMapping("/add")
	public String insertMarkSheet(@RequestBody MarkSheet m){
		String url="http://localhost:8081/student/getroll/";
		ResponseEntity<Integer>rr=rt.exchange(url+m.getId(),HttpMethod.GET, null,Integer.class);
		int s=rr.getBody();
		m.setRollNumber(s);
		return markser.insertMarksheet(m);
	}


}
