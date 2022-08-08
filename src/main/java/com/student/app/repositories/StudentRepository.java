package com.student.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.app.entity.StudentInfo;

@Repository  
// no need to add annotation because jparepository has an implementation class name as simplejparepository
// and that class is already annotated with @Repository annotation 
public interface StudentRepository extends JpaRepository<StudentInfo, Long>{
	
//	List<StudentInfo> findStudentInfoByfirstname(String firstname);

}
