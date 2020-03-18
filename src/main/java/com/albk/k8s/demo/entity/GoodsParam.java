package com.albk.k8s.demo.entity;

import lombok.Data;

/**
 * @author BK
 * @description:
 * @date 2020/3/15 10:00 上午
 */
@Data
public class GoodsParam {
    private Long gpId;
    private String gpParamName;
    private String gpParamValue;
    private Long goodsId;
    private Integer gpOrder;

}
