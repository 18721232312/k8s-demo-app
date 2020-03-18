package com.albk.k8s.demo.controller;

import com.albk.k8s.demo.entity.Goods;
import com.albk.k8s.demo.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
/**
 * @author BK
 * @description:
 * @date 2020/3/15 9:54 上午
 */
@Slf4j
@Controller
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    public GoodsController() {
    }


    @GetMapping({"/goods"})
    public ModelAndView showGoods(Long gid) {
        log.info("gid:" + gid);
        ModelAndView mav = new ModelAndView("/goods");
        Goods goods = this.goodsService.getGoods(gid);
        mav.addObject("goods", goods);
        mav.addObject("covers", this.goodsService.findCovers(gid));
        mav.addObject("details", this.goodsService.findDetails(gid));
        mav.addObject("params", this.goodsService.findParams(gid));
        return mav;
    }
}
