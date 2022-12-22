package com.ems.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @TableId(type = IdType.AUTO)
    private Integer did;
    private String dName;
    private Integer dLevel;
    private String dRemark;
}
