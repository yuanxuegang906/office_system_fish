package com.qf.controller;

import com.qf.pojo.*;
import com.qf.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/*
 * author:袁学港
 * Date:2019/7/13 14:39
 * info:
 * */
@Controller
public class LoginController {
    @Autowired
    private SecurityManager securityManager;
    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "/login";
    }
    @RequestMapping(value = "/adminLogin")
    public String adminLogin(){
        return "adminLogin";
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String username,String password,String identity, HttpSession session){
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,password);
        try{
            session.setAttribute("identity",identity);
            subject.login(usernamePasswordToken);
            if (identity.equals("admin")){
                if (subject.isAuthenticated()){
                    Admin admin = loginService.getAdmin(username);
                    session.setAttribute("admin","admin");
                    return "adminPage";
                }else {
                    return "adminLogin";
                }

            }
            if(subject.isAuthenticated()){
                session.setAttribute("username",username);

                if (identity.equals("teacher")){
                    Teacher teacher = loginService.getTeacher(username);
                    session.setAttribute("teacher",teacher);
                    return "forward:teacherIndex";
                }
                if (identity.equals("manager")){
                    Manager manager = loginService.getManager(username);
                    session.setAttribute("manager",manager);
                    return "forward:adminLogin";
                }
                if (identity.equals("boss")){
                    Boss boss = loginService.getBoss(username);
                    session.setAttribute("boss",boss);
                    return "forward:boss";
                }
                if (identity.equals("student")){
                    Student student = loginService.getStudent(username);
                    session.setAttribute("student",student);
                    return "forward:student";
                }
            }

        }catch (AuthenticationException e){
            System.out.println("登录失败");
        }
        return "login";
    }
    @RequestMapping("adminLogout")
    public String logout(HttpSession session){
        session.removeAttribute("admin");
        return "adminLogin";
    }
    @RequestMapping("homepage")
    public String homepage(){
        return "homepage";
    }
    @RequestMapping("unauthorize")
    public String unauthorize(){
        return "unauthorize";
    }
}
