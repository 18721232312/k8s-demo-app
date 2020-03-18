package com.albk.k8s.demo.entity;

import lombok.Data;

/**
 * @author BK
 * @description:
 * @date 2020/3/15 10:00 上午
 */
@Data
public class Goods {
    private Long goodsId;
    private String title;
    private String subTitle;
    private Float originalCost;
    private Float currentPrice;
    private Float discount;
    private Integer isFreeDelivery;
    private Long categoryId;
}
