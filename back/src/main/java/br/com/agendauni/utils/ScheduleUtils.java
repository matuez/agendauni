package br.com.agendauni.utils;

import br.com.agendauni.dto.ScheduleDto;
import br.com.agendauni.model.Schedule;
import lombok.experimental.UtilityClass;

UtilityClass
public class ScheduleUtils {

    public ScheduleDto convertDtoToEntity(Schedule schedule) {

        return ScheduleDto.builder()
                .dayWeekEnum(schedule.getDayWeekEnum())
                .startingTime(schedule.getStartingTime())
                .endingTime(schedule.getEndingTime())
                .room(schedule.getRoom())
                .build();
    }

    public Schedule convertDtoToEntity(ScheduleDto scheduleDto) {

        return Schedule.builder()
                .dayWeekEnum(scheduleDto.getDayWeekEnum())
                .startingTime(scheduleDto.getStartingTime())
                .endingTime(scheduleDto.getEndingTime())
                .room(scheduleDto.getRoom())
                .build();
    }
}
