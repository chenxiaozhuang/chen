package com.tckj.tckj.user.service.impl;

import com.tckj.tckj.user.dao.UserMapper;
import com.tckj.tckj.user.entity.User;
import com.tckj.tckj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //注入Mapper接口
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
