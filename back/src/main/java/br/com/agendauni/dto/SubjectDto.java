package br.agendauni.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link br.com.agendauni.model Subject}
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDto implements Serializable {
    private String subjectName;
    private List<ScheduleDto> schedules;
    private TeacherDto teacher;
    private CourseDto course;
}