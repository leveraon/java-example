/**
 * LEVERAON INC
 *
 * 2015 - 2019 ALL RIGHTS RESERVED
 */
package com.leveraon.code.example.jpastoreprocedure.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.leveraon.code.example.jpastoreprocedure.dto.DataModel;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yves.sang
 *
 *         Created on: Oct. 6, 2019
 */
@SpringBootTest
@Slf4j
public class StudentServiceImplTest {

	@Autowired
	private StudentService studentService;

	@Test
	public void testListStudentsByClass() {

		List<DataModel> result = studentService.listStudentsByClass();

		assertNotNull(result);

		log.info("----------------------------------");
		result.stream().forEach(m -> {
			log.info("Class Name: {} | Students: {}", m.getCode(), m.getValue());
			log.info("----------------------------------");
		});
	}

}
