/**
 * LEVERAON INC
 *
 * 2015 - 2019 ALL RIGHTS RESERVED
 */
package com.leveraon.code.example.jpastoreprocedure.repository;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leveraon.code.example.jpastoreprocedure.entity.Student;

/**
 * @author yves.sang
 *
 *         Created on: Oct. 6, 2019
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, UUID> {

	@Query(value = "select * from  example.list_students_each_class()", nativeQuery = true)
	public List<Map<String, String>> listStudentsByClass();

}
