package com.StudentDetail.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.StudentDetail.Model.StudentDetailModel;
@Repository
public interface StudentDtailRepository extends CrudRepository<StudentDetailModel, Integer> {

}
