package com.qf.service;

import com.qf.pojo.*;

/*
 * author:袁学港
 * Date:2019/7/16 13:43
 * info:
 * */
public interface LoginService {
    Student getStudent(String username);
    Teacher getTeacher(String username);
    Manager getManager(String username);
    Boss getBoss(String username);
    Admin getAdmin(String username);
}
