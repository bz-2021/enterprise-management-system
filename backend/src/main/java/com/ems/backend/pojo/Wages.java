package com.ems.backend.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wages {
    private Integer id;
    private Integer baseSalary;
    private Integer bonus;
    private Integer deductWages;
    private Integer deductReason;
    private Integer netSalary;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date wtime;
}
