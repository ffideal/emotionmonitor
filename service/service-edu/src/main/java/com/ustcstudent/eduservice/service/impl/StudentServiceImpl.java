package com.ustcstudent.eduservice.service.impl;

import com.ustcstudent.eduservice.entity.Student;
import com.ustcstudent.eduservice.mapper.StudentMapper;
import com.ustcstudent.eduservice.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生表 服务实现类
 * </p>
 *
 * @author xutao
 * @since 2022-10-06
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
