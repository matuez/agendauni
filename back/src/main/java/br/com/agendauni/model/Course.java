package br.com.agendauni.model;

import br.com.agendauni.model.enums.CourseEnum;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

Entity
Getter
Setter
Builder
NoArgsConstructor
AllArgsConstructor
Table(name = "course")
public class Course {
    Id Builder.Default
    private UUID courseId = UUID.randomUUID();
    private String courseName;
    private CourseEnum courseType;

}
