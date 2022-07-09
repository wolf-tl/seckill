package com.tl.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tl.seckill.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TOrderMapper extends BaseMapper<TOrder> {

}
