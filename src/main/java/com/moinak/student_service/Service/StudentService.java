package com.moinak.student_service.Service;

import com.moinak.student_service.Entity.Student;
import com.moinak.student_service.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(String id, Student studentDetails) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student with ID " + id + " does not exist!"));
        existingStudent.setName(studentDetails.getName());
        existingStudent.setSkill(studentDetails.getSkill());
        existingStudent.setBatch(studentDetails.getBatch());
        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }


}
