package com.springboot.cloud.common.web.entity.vo;

import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LiuShiZeng
 * @since 2020/4/19
 */
@Data
@NoArgsConstructor
public class BaseVo<T extends BasePo> implements Serializable {

    private String id;

}
