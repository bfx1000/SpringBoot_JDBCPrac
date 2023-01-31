package com.cunyu.service;

import com.cunyu.pojo.User;

import java.util.List;

/**
 * @author : cunyu
 * @version : 1.0
 * @className : UserService
 * @date : 2020/7/29 21:12
 * @description : TODO
 */

public interface UserService {
    /**
     * @param
     * @return
     * @description 获取所有数据列表
     * @date 2020/7/29 21:57
     * @author cunyu1943
     * @version 1.0
     */
    public List<User> getList();
}