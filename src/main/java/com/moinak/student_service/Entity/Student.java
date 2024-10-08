package com.moinak.student_service.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "students")
public class Student {
    @Id
    private String id;
    private String name;
    private List<String> skill;
    private String batch;
}
