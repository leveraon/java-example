/**
 * LEVERAON INC
 *
 * 2015 - 2019 ALL RIGHTS RESERVED
 */
package com.leveraon.code.example.jpa.sp.repository;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leveraon.code.example.jpa.sp.entity.Student;

/**
 * @author yves.sang
 *
 *         Created on: Oct. 6, 2019
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, UUID> {

	@Query(value = "SELECT * FROM  EXAMPLE.LIST_STUDENTS_EACH_CLASS()", nativeQuery = true)
	public List<Map<String, String>> listStudentsByClass();

}
