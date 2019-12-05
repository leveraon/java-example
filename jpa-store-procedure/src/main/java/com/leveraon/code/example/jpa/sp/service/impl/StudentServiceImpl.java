/**
 * LEVERAON INC
 *
 * 2015 - 2019 ALL RIGHTS RESERVED
 */
package com.leveraon.code.example.jpa.sp.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leveraon.code.example.jpa.sp.dto.DataModel;
import com.leveraon.code.example.jpa.sp.repository.StudentRepository;
import com.leveraon.code.example.jpa.sp.service.StudentService;

/**
 * @author yves.sang
 *
 *         Created on: Oct. 6, 2019
 */
@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.leveraon.code.example.jpastoreprocedure.service.StudentService#
	 * listStudentsByClass()
	 */
	@Override
	public List<DataModel> listStudentsByClass() {

		List<Map<String, String>> result = this.studentRepository.listStudentsByClass();

		return result.stream().map(m -> {
			return DataModel.builder().code(m.get("class_name")).value(m.get("student_number")).build();
		}).collect(Collectors.toList());
	}

}
