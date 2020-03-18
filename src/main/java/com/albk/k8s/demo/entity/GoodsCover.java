package com.albk.k8s.demo.entity;

import lombok.Data;

/**
 * @author BK
 * @description:
 * @date 2020/3/15 10:00 上午
 */
@Data
public class GoodsCover {
    private Long gcId;
    private Long goodsId;
    private String gcPicUrl;
    private String gcThumbUrl;
    private Long gcOrder;

}
