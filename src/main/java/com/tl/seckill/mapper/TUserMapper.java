package com.tl.seckill.mapper;

import com.tl.seckill.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TUserMapper extends BaseMapper<TUser> {

}
