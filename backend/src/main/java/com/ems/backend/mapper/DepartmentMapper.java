package com.ems.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ems.backend.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
}
