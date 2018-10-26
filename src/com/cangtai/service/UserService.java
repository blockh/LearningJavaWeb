package com.cangtai.service;

import com.cangtai.dao.UserDao;
import com.cangtai.domain.User;

/**
 * @author Blockhead
 * 2018/10/16 23:28
 */
public class UserService {
    //service层依赖于dao层
    private UserDao userDao = new UserDao();

    /**
     * service的查询，需要使用到来完成
     * @return
     */
    public User find(){
        return userDao.find();
    }
}
