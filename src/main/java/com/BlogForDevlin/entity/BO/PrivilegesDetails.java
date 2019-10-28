package com.BlogForDevlin.Entity.BO;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * <p>
    * 
    * </p>
 *
 * @author Devlin-Kim
 * @since 2019-10-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("Privileges_Details")
@ApiModel(value="PrivilegesDetails对象", description="")
public class PrivilegesDetails extends Model {

    @ApiModelProperty(value = "PK_id gonna have it")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "autoTime gonna have it")
    @TableField("gmt_createTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtCreatetime;

    @ApiModelProperty(value = "autoTime(change all the time) gonna have it")
    @TableField("gmt_modifyTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtModifytime;

    @ApiModelProperty(value = "0 n 1 y")
    @TableField("privileges_insert")
    private Integer privilegesInsert;

    @ApiModelProperty(value = "0 n 1 y")
    @TableField("privileges_publish")
    private Integer privilegesPublish;

    @ApiModelProperty(value = "0 n 1 y")
    @TableField("privileges_user")
    private Integer privilegesUser;

    @ApiModelProperty(value = "0 n 1 y")
    @TableField("privileges_tag")
    private Integer privilegesTag;

    @TableField("privileges_name")
    private String privilegesName;

    @ApiModelProperty(value = "0 delete 1 publish 2 used 3 abandon ")
    @TableField("privileges_status")
    private Integer privilegesStatus;



}
