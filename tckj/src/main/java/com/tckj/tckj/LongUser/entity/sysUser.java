package com.tckj.tckj.LongUser.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class sysUser implements Serializable {
    private Long id;
    private String userName;
    private String passWord;
    private int age;
    private String email;
    private String address;
    private String phone;

}
