package com.albk.k8s.demo.persistent;

import com.albk.k8s.demo.entity.Goods;

/**
 * @author BK
 * @description:
 * @date 2020/3/15 10:05 上午
 */
public interface GoodsDAO {

    Goods findById(Long goodsId);
}
