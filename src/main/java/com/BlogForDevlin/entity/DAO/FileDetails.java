package com.BlogForDevlin.entity.DAO;

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
@TableName("File_Details")
@ApiModel(value="FileDetails对象", description="")
public class FileDetails extends Model {

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

    @ApiModelProperty(value = "related user_details")
    @TableField("user_id")
    private Integer userId;

    @TableField("file_size")
    private String fileSize;

    @TableField("file_path")
    private String filePath;

    @TableField("file_name")
    private String fileName;

    @ApiModelProperty(value = "0 delete 1 upload 2 secret ")
    @TableField("file_status")
    private Integer fileStatus;



}
