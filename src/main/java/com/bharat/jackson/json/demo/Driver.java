package com.bharat.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			Student student = mapper.readValue(new File("data/sample2.json"), Student.class);
			System.out.println(student.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
