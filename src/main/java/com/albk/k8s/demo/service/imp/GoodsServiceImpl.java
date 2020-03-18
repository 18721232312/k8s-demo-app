package com.albk.k8s.demo.service.imp;

import com.albk.k8s.demo.entity.Goods;
import com.albk.k8s.demo.entity.GoodsCover;
import com.albk.k8s.demo.entity.GoodsDetail;
import com.albk.k8s.demo.entity.GoodsParam;
import com.albk.k8s.demo.persistent.GoodsCoverDAO;
import com.albk.k8s.demo.persistent.GoodsDAO;
import com.albk.k8s.demo.persistent.GoodsDetailDAO;
import com.albk.k8s.demo.persistent.GoodsParamDAO;
import com.albk.k8s.demo.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author BK
 * @description:
 * @date 2020/3/15 10:03 上午
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDAO goodsDAO;
    @Resource
    private GoodsCoverDAO goodsCoverDAO;
    @Resource
    private GoodsDetailDAO goodsDetailDAO;
    @Resource
    private GoodsParamDAO goodsParamDAO;

    public Goods getGoods(Long goodsId) {
        return this.goodsDAO.findById(goodsId);
    }

    public List<GoodsCover> findCovers(Long goodsId) {
        return this.goodsCoverDAO.findByGoodsId(goodsId);
    }

    public List<GoodsDetail> findDetails(Long goodsId) {
        return this.goodsDetailDAO.findByGoodsId(goodsId);
    }

    public List<GoodsParam> findParams(Long goodsId) {
        List list = this.goodsParamDAO.findByGoodsId(goodsId);
        return list;
    }
}
