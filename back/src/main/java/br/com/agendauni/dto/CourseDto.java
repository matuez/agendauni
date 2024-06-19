package br.com.agendauni.dto;

import br.com.agendauni.model.enums.CourseEnum;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link br.com.agendauni.model Course}
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto implements Serializable {
    private String courseName;
    private CourseEnum courseType;
}