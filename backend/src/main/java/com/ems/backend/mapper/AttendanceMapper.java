package com.ems.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ems.backend.pojo.Attendance;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttendanceMapper extends BaseMapper<Attendance> {
}
