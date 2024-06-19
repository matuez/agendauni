package br.com.agendauni.dto;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link br.com.agendauni.model Teacher}
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeacherDto implements Serializable {
    private String teacherFirstName;
    private String teacherLastName;
    private String teacherEmail;
}