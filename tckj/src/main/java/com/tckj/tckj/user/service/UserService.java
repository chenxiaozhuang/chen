package com.tckj.tckj.user.service;

import com.tckj.tckj.user.entity.User;

public interface UserService {
    public User findByName(String name);
    public User findById(Integer id);
}
