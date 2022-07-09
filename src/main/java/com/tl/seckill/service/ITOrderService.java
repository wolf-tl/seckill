package com.tl.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tl.seckill.entity.TOrder;
import com.tl.seckill.entity.TUser;
import com.tl.seckill.vo.GoodsVo;
import com.tl.seckill.vo.OrderDeatilVo;

public interface ITOrderService extends IService<TOrder> {

    TOrder secKill(TUser user, GoodsVo goodsVo);

    OrderDeatilVo detail(Long orderId);

    String createPath(TUser user, Long goodsId);

    boolean checkPath(TUser user, Long goodsId, String path);

    boolean checkCaptcha(TUser tuser, Long goodsId, String captcha);
}
