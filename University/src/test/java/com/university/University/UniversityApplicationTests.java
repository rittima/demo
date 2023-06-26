package com.university.University;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mongodb.connection.Stream;
import com.university.University.Model.Student;
import com.university.University.controller.StudentController;
import com.university.University.repo.StudentRepo;

@SpringBootTest
@RunWith(SpringRunner.class)
class UniversityApplicationTests {

	@MockBean
	StudentRepo repo;
	
	@Autowired
	StudentController sc;

}
