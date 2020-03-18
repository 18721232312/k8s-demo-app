package com.albk.k8s.demo.service;

import com.albk.k8s.demo.entity.Goods;
import com.albk.k8s.demo.entity.GoodsCover;
import com.albk.k8s.demo.entity.GoodsDetail;
import com.albk.k8s.demo.entity.GoodsParam;

import java.util.List;

/**
 * @author BK
 * @description:
 * @date 2020/3/15 10:02 上午
 */
public interface GoodsService {


    Goods getGoods(Long goodsId);
    List<GoodsCover> findCovers(Long goodsId);
    List<GoodsDetail> findDetails(Long goodsId);
    List<GoodsParam> findParams(Long goodsId) ;
}
