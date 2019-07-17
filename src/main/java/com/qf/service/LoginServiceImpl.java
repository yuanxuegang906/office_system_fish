package com.qf.service;

import com.qf.mapper.*;
import com.qf.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * author:袁学港
 * Date:2019/7/16 13:44
 * info:
 * */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private ManagerMapper managerMapper;
    @Autowired
    private BossMapper bossMapper;
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Student getStudent(String username) {
        Student student = studentMapper.getStudent(username);
        return student;
    }

    @Override
    public Teacher getTeacher(String username) {
        Teacher teacher = teacherMapper.getTeacher(username);
        return teacher;
    }

    @Override
    public Manager getManager(String username) {
        Manager manager = managerMapper.getManager(username);
        return manager;
    }

    @Override
    public Boss getBoss(String username) {
        Boss boss = bossMapper.getBoss(username);
        return boss;
    }

    @Override
    public Admin getAdmin(String username) {
        Admin admin = adminMapper.getAdmin(username);
        return admin;
    }
}
