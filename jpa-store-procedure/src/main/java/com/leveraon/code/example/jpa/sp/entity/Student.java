package com.leveraon.code.example.jpa.sp.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "student_id")
	private UUID studentId;

	@Column(name = "class_room")
	private String classRoom;

	@Column(name = "student_name")
	private String studentName;

}