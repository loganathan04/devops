package com.example.Marksheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Marksheet.entity.MarkSheet;
import com.example.Marksheet.repositary.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository markRepo;
	public String  insertMarkSheet(MarkSheet m) {
		markRepo.save(m);
		return "SuccessFully added";
	}
	
	
}
