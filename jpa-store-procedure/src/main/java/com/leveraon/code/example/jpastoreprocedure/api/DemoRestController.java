/**
 * LEVERAON INC
 *
 * 2015 - 2019 ALL RIGHTS RESERVED
 */
package com.leveraon.code.example.jpastoreprocedure.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leveraon.code.example.jpastoreprocedure.dto.DataModel;
import com.leveraon.code.example.jpastoreprocedure.service.StudentService;

/**
 * @author yves.sang
 *
 *         Created on: Oct. 6, 2019
 */
@RestController
public class DemoRestController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<DataModel>> getStudentsStatistic() {
		List<DataModel> result = studentService.listStudentsByClass();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
