package eu.mdpop.timetracking.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserStatus {

    IS_WORKING("active"), DISMISSED("not active");

    private String status;

}
