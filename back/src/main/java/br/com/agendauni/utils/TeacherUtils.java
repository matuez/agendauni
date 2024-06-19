package br.com.agendauni.utils;

import br.com.agendauni.dto.TeacherDto;
import br.com.agendauni.model.Teacher;
import lombok.experimental.UtilityClass;

import java.util.UUID;

UtilityClass
public class TeacherUtils {

    public TeacherDto convertEntityToDto(Teacher teacher) {

        return TeacherDto.builder()
                .teacherFirstName(teacher.getTeacherFirstName())
                .teacherLastName(teacher.getTeacherLastName())
                .teacherEmail(teacher.getTeacherEmail())
                .build();
    }

    public Teacher convertDtoToEntity(TeacherDto teacher) {

        return Teacher.builder()
                .teacherId(UUID.randomUUID())
                .teacherFirstName(teacher.getTeacherFirstName())
                .teacherLastName(teacher.getTeacherLastName())
                .teacherEmail(teacher.getTeacherEmail())
                .build();
    }
}
