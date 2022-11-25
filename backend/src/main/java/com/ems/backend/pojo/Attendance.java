package com.ems.backend.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attendance {
    private Integer id;
    private Integer attendance;
    private Integer late;
    private Integer leaveEarly;
    private Integer absence;
    private Integer overtime;
}
