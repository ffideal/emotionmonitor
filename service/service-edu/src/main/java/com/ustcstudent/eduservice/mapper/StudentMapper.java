package com.ustcstudent.eduservice.mapper;

import com.ustcstudent.eduservice.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 学生表 Mapper 接口
 * </p>
 *
 * @author xutao
 * @since 2022-10-06
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
