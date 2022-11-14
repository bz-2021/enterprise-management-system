package com.ems.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String gender;
    private String photo;
    private String ethnicity;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date birthday;
    private String politicalFace;
    private String education;
    private String idCard;
    private String phoneNumber;
    private String password;
    private Integer department;
    private String status;
}
