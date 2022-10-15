package com.ustcstudent.eduservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学生表
 * </p>
 *
 * @author xutao
 * @since 2022-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Student对象", description="学生表")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生编号")
    private String sno;

    @ApiModelProperty(value = "学生学号")
    private String sid;

    @ApiModelProperty(value = "学生姓名")
    private String sname;

    @ApiModelProperty(value = "学生年龄")
    private Integer sage;

    @ApiModelProperty(value = "学生性别")
    private String sgender;

    @ApiModelProperty(value = "学生年级")
    private Integer sgrade;

    @ApiModelProperty(value = "学生班级")
    private String sclass;

    @ApiModelProperty(value = "学生专业")
    private String smajor;

    @ApiModelProperty(value = "学生联系方式")
    private String sphone;


}
