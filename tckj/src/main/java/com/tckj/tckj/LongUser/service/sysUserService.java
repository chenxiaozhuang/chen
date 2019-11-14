package com.tckj.tckj.LongUser.service;

import com.tckj.tckj.LongUser.dao.sysUserMapper;
import com.tckj.tckj.LongUser.entity.sysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sysUserService {
    @Autowired(required = false)
    sysUserMapper userMapperdao;

    public List<sysUser> getAllUser(){
        return userMapperdao.getAllUser();
    }
}

