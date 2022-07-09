package com.tl.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tl.seckill.entity.TGoods;
import com.tl.seckill.vo.GoodsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TGoodsMapper extends BaseMapper<TGoods> {

    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
