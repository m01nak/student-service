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
        Optional<Student> optionalStudent = studentRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student existingStudent = optionalStudent.get();
            existingStudent.setName(studentDetails.getName());
            existingStudent.setSkill(studentDetails.getSkill());
            existingStudent.setBatch(studentDetails.getBatch());
            return studentRepository.save(existingStudent);
        } else {
            return null;
        }
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }


}
