package eu.mdpop.timetracking.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class RecordingSheetDto extends BaseDto {

    private String userEmail;

    private LocalDate date;

    private LocalTime startWork;

    private LocalTime finishWork;

    private int shift1;

    private int shift2;

    private int shift3;

    private int holiday;

}
