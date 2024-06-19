package br.com.agendauni.dto;

import br.com.agendauni.model.enums.DayWeekEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link br.com.agendauni.model Schedule}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheduleDto implements Serializable {
    private DayWeekEnum dayWeekEnum;
    private String startingTime;
    private String endingTime;
    private String room;

}