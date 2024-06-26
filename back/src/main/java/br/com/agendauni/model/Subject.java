package br.com.agendauni.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

Entity
Getter
Setter
Builder
NoArgsConstructor
AllArgsConstructor
Table(name = "subject")
public class Subject {
    @Id @Builder.Default
    private UUID subjectId = UUID.randomUUID();
    private String subjectName;
    @OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Schedule> schedules;
    @OneToOne
    private Course course;
    @OneToOne
    private Teacher teacher;

}
