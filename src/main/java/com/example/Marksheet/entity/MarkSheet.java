package com.example.Marksheet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="marksheet")
public class MarkSheet {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private int rollNumber;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRollNumber() {
	return rollNumber;
}
public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}
public int getSem1Theory() {
	return sem1Theory;
}
public void setSem1Theory(int sem1Theory) {
	this.sem1Theory = sem1Theory;
}
public int getSem1Practicals() {
	return sem1Practicals;
}
public void setSem1Practicals(int sem1Practicals) {
	this.sem1Practicals = sem1Practicals;
}
public int getSem2Theory() {
	return sem2Theory;
}
public void setSem2Theory(int sem2Theory) {
	this.sem2Theory = sem2Theory;
}
public int getSem2Praticals() {
	return sem2Praticals;
}
public void setSem2Praticals(int sem2Praticals) {
	this.sem2Praticals = sem2Praticals;
}
public int getSem1Total() {
	return sem1Total;
}
public void setSem1Total(int sem1Total) {
	this.sem1Total = sem1Total;
}
public int getSem2total() {
	return sem2total;
}
public void setSem2total(int sem2total) {
	this.sem2total = sem2total;
}
private int sem1Theory;
private int sem1Practicals;
private int sem2Theory;
private int sem2Praticals;
private int sem1Total;
private int sem2total;
}
