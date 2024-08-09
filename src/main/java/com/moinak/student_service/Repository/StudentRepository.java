package com.moinak.student_service.Repository;

import com.moinak.student_service.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> { }
