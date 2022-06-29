package com.StudentDetail.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class StudentDetailModel {
	@Id
	private int id;
	private int fee;
	private String callegename;
	private String studentname;
	private String loc;
	

}
