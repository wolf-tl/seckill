package com.tl.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tl.seckill.entity.TUser;
import com.tl.seckill.vo.LoginVo;
import com.tl.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface ITUserService extends IService<TUser> {

    RespBean doLongin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);

    TUser getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);

    RespBean updatePassword(String userTicket, String password, HttpServletRequest request, HttpServletResponse response);
}
