package com.example.Marksheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Marksheet.dao.MarkSheetDao;
import com.example.Marksheet.entity.MarkSheet;

@Service
public class MarkSheetService {
@Autowired
MarkSheetDao markdao;
public String insertMarksheet(@PathVariable MarkSheet s) {
	int temp=s.getSem1Theory()+s.getSem1Practicals();
	s.setSem1Total(temp);
	int temp1=s.getSem2Theory()+s.getSem2Praticals();
	s.setSem2total(temp1);
	return markdao.insertMarkSheet(s);
}


}
