package com.StudentDetail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDetail.Model.StudentDetailModel;
import com.StudentDetail.Repository.StudentDtailRepository;
@Service
public class StudentDetailService {
	
	
	@Autowired
	StudentDtailRepository studentDetailRepository;

	public void poststudentDetailModel(StudentDetailModel studentDetailModel) {
		studentDetailRepository.save(studentDetailModel);
		
	}

	public void updatestudentDetailModelById(int id, StudentDetailModel studentDetailModel) {
		Optional<StudentDetailModel> studentDetailModel1=studentDetailRepository.findById(id);
		
		StudentDetailModel StudentDetailModel2=studentDetailModel1.get();
		StudentDetailModel2.setId(studentDetailModel.getId());
		StudentDetailModel2.setFee(studentDetailModel.getFee());
		StudentDetailModel2.setStudentname(studentDetailModel.getStudentname());
		StudentDetailModel2.setCallegename(studentDetailModel.getCallegename());
		studentDetailRepository.save(studentDetailModel);
	}

	public List<StudentDetailModel> getStudentDetailModel() {
		List<StudentDetailModel>studentDetailModel=(List<StudentDetailModel>)studentDetailRepository.findAll();
		return studentDetailModel;
	}

	public void deletestudentDetailModelById(int id) {
		studentDetailRepository.deleteById(id);
		
	}
	
	

}
