package com.maththomaz.user.VO;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
