package com.albk.k8s.demo.persistent;

import com.albk.k8s.demo.entity.GoodsDetail;

import java.util.List;

/**
 * @author BK
 * @description:
 * @date 2020/3/15 10:05 上午
 */
public interface GoodsDetailDAO {

    List<GoodsDetail> findByGoodsId(Long goodsId);
}
