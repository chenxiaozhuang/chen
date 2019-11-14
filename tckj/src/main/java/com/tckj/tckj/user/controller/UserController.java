package com.tckj.tckj.user.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    /**
     * 登录逻辑处理
     */
    @RequestMapping("/login")
    public String login(String name, String password, Model model){
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        //3.执行登录方法
        try {
            subject.login(token);
            //登录成功
            return "redirect:/testThymeleaf";
        } catch (UnknownAccountException e) {
            //登录失败:用户名不存在
            model.addAttribute("msg", "用户名不存在");
            return "login";
        }catch (IncorrectCredentialsException e) {
            //登录失败:密码错误
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }
    //无权限
    @RequestMapping("/noAuth")
    public String noAuth(){
        return "noAuth";
    }
    //退出
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

}
