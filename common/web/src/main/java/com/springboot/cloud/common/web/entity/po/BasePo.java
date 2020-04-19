package com.springboot.cloud.common.web.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author LiuShiZeng
 * @since 2020/4/19
 */
@Data
public class BasePo implements Serializable {

    public final static String DEFAULT_USERNAME = "system";
    @TableId(type = IdType.AUTO)
    private String id;
    private String createdBy = DEFAULT_USERNAME;
    private String updatedBy = DEFAULT_USERNAME;
    private Date createdTime = Date.from(ZonedDateTime.now().toInstant());
    private Date updatedTime = Date.from(ZonedDateTime.now().toInstant());

}
