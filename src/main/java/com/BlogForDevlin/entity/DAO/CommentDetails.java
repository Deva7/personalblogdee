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
@TableName("Comment_Details")
@ApiModel(value="CommentDetails对象", description="")
public class CommentDetails extends Model {

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

    @TableField("comment_context")
    private String commentContext;

    @ApiModelProperty(value = "related blog_id")
    @TableField("blog_id")
    private Integer blogId;

    @ApiModelProperty(value = "0 delete 1 publish 2 reported 3 secret")
    @TableField("comment_status")
    private Integer commentStatus;

    @TableField("rate_count")
    private Integer rateCount;



}
