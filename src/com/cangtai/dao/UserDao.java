package com.cangtai.dao;

import com.cangtai.domain.User;

/**
 * @author Blockhead
 * 2018/10/16 23:21
 */
public class UserDao  {
    /**
     * 这里是一个模拟的数据
     */
    public User find(){
        return new User("ZhangSan","123456");
    }
}
