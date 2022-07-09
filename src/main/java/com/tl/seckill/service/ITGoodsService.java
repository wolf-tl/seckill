package com.tl.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tl.seckill.entity.TGoods;
import com.tl.seckill.vo.GoodsVo;

import java.util.List;

public interface ITGoodsService extends IService<TGoods> {

    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
