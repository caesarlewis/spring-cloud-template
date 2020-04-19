package com.springboot.cloud.common.web.entity.form;

import com.springboot.cloud.common.web.entity.po.BasePo;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

/**
 * @author LiuShiZeng
 * @since 2020/4/19
 */
@Data
@ApiModel
public class BaseForm<T extends BasePo> {

    /**
     * 用户名
     */
    private String username;
    /**
     * From转化为Po，进行后续业务处理
     *
     * @param clazz
     * @return
     */
    public T toPo(Class<T> clazz){
        T t = BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(this,t);
        return t;
    }

}
