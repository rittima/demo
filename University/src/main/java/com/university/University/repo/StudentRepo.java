package com.university.University.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.university.University.Model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Long> {

}
