/**
 * LEVERAON INC
 *
 * 2015 - 2019 ALL RIGHTS RESERVED
 */
package com.leveraon.code.example.jpa.sp.service;

import java.util.List;

import com.leveraon.code.example.jpa.sp.dto.DataModel;

/**
 * @author yves.sang
 *
 *         Created on: Oct. 6, 2019
 */
public interface StudentService {

	public List<DataModel> listStudentsByClass();
}
