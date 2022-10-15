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
 * 教师表
 * </p>
 *
 * @author xutao
 * @since 2022-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Teacher对象", description="教师表")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "教师编号")
    private String tno;

    @ApiModelProperty(value = "学生姓名")
    private String tname;

    @ApiModelProperty(value = "教师年龄")
    private Integer tage;

    @ApiModelProperty(value = "教师性别")
    private String tgender;

    @ApiModelProperty(value = "教师联系方式")
    private String tphone;


}
