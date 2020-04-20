package com.lishuo.dao;

import com.lishuo.annotation.Select;
import com.lishuo.pojo.User;

import java.util.List;

public interface IUserDao {

    @Select("select * from user")
    List<User> findAll();

}
