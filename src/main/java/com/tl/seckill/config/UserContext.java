package com.tl.seckill.config;

import com.tl.seckill.entity.TUser;

public class UserContext {

    private static ThreadLocal<TUser> userThreadLocal = new ThreadLocal<>();

    public static void setUser(TUser tUser) {
        userThreadLocal.set(tUser);
    }

    public static TUser getUser() {
        return userThreadLocal.get();
    }
}
