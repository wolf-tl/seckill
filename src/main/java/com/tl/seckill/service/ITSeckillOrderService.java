package com.tl.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tl.seckill.entity.TSeckillOrder;
import com.tl.seckill.entity.TUser;

public interface ITSeckillOrderService extends IService<TSeckillOrder> {

    Long getResult(TUser tUser, Long goodsId);
}
