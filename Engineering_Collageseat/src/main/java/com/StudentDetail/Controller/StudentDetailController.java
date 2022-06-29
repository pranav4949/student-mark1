package com.StudentDetail.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetail.Model.StudentDetailModel;
import com.StudentDetail.service.StudentDetailService;

@RestController
@RequestMapping("/detail")
public class StudentDetailController {
	
	@Autowired
	StudentDetailService studentDetailService;
	
	@PostMapping("/post")
	private String poststudentDetailModel(@RequestBody StudentDetailModel studentDetailModel) {
		studentDetailService.poststudentDetailModel(studentDetailModel);
		return "Data sucessfully posted.....";
	}
	
	@PutMapping("/put/{id}")
	private String updatestudentDetailModel(@PathVariable int id,@RequestBody StudentDetailModel studentDetailModel) {
		studentDetailService.updatestudentDetailModelById(id,studentDetailModel);
		return "Data sucefully updated....";
	}
	@GetMapping("/get")
	private List<StudentDetailModel>getStudentDetailModel(){
		List<StudentDetailModel>studentDetailModel =studentDetailService.getStudentDetailModel();
		
		return (List<StudentDetailModel>)studentDetailModel;
		
	}
	
	@DeleteMapping("/del/{id}")
	private String deletestudentDetailModelById(@PathVariable int id) {
		studentDetailService.deletestudentDetailModelById(id);
		return "Data sucessfully deleted......";
	}

}
