package eu.mdpop.timetracking.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto extends BaseDto{

    private String email;

    private String password;

    private String firstName;

    private String middleName;

    private String lastName;

    private String post;

    private String gender;

    private LocalDate birthday;

    private LocalDate hiringDate;

    private String status;

    private String profileImageUrl;

}
