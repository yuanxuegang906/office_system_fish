package com.qf.service;

import com.qf.mapper.ClassesMapper;
import com.qf.mapper.ManagerMapper;
import com.qf.mapper.StudentMapper;
import com.qf.mapper.TeacherMapper;
import com.qf.pojo.Classes;
import com.qf.pojo.Manager;
import com.qf.pojo.Student;
import com.qf.pojo.Teacher;
import com.qf.util.HanyuPinyinHelp;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * author:袁学港
 * Date:2019/7/16 17:17
 * info:
 * */
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private ManagerMapper managerMapper;
    @Autowired
    private ClassesMapper classesMapper;
    @Override
    public List<Student> getStudents() {
        List<Student> students = studentMapper.selectByExample(null);
        return students;
    }

    @Override
    public List<Teacher> getTeachers() {
        List<Teacher> teachers = teacherMapper.selectByExample(null);
        return teachers;
    }

    @Override
    public List<Manager> getManagers() {
        List<Manager> managers = managerMapper.selectByExample(null);
        return managers;
    }

    @Override
    public List<Classes> getClasses() {
        List<Classes> classes = classesMapper.getClasses();
        return classes;
    }

    @Override
    public int addClasses(Classes classes) {
        int i = classesMapper.insertSelective(classes);
        return i;
    }

    @Override
    public int delClasses(int cid) {
        int i = classesMapper.deleteByPrimaryKey(cid);
        return i;
    }

    @Override
    public int delStudent(int sid) {
        int i = studentMapper.deleteByPrimaryKey(sid);
        return i;
    }

    @Override
    public int delTeacher(int tid) {
        int i = teacherMapper.deleteByPrimaryKey(tid);
        return i;
    }

    @Override
    public int delManager(int mid) {
        int i = managerMapper.deleteByPrimaryKey(mid);
        return i;
    }

    @Override
    public int updatePassword(int sid) {
        Student student = new Student();
        student.setSid(sid);
        Md5Hash md5Hash = new Md5Hash("123456");
        student.setPassword(md5Hash.toString());
        int i = studentMapper.updateByPrimaryKeySelective(student);
        return i;
    }

    @Override
    public int updateManagerPassword(int mid) {
        Md5Hash md5Hash = new Md5Hash("123456");
        Manager manager = new Manager();
        manager.setMid(mid);
        manager.setPassword(md5Hash.toString());
        int i = managerMapper.updateByPrimaryKeySelective(manager);
        return i;
    }

    @Override
    public int updateTeacherPassword(int tid) {
        Md5Hash md5Hash = new Md5Hash("123456");
        Teacher teacher = new Teacher();
        teacher.setTid(tid);
        teacher.setPassword(md5Hash.toString());
        int i = teacherMapper.updateByPrimaryKeySelective(teacher);
        return i;
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        List<Student> students = studentMapper.selectStudentByName(name);
        return students;
    }

    @Override
    public List<Teacher> selectTeacherByName(String name) {
        List<Teacher> teachers = teacherMapper.selectTeacherByName(name);
        return teachers;
    }

    @Override
    public List<Manager> selectManagerByName(String name) {
        List<Manager> managers = managerMapper.selectManagerByName(name);
        return managers;
    }

    @Override
    public int updateClasses(Classes classes) {
        int i = classesMapper.insertSelective(classes);
        return i;
    }

    @Override
    public int addTeacher(Teacher teacher) {
        String username = HanyuPinyinHelp.toHanyuPinyin(teacher.getTname());
        teacher.setUsername(username);
        Md5Hash md5Hash = new Md5Hash("123456");
        teacher.setPassword(md5Hash.toString());
        int i = teacherMapper.insertSelective(teacher);
        return i;
    }

    @Override
    public int addManager(Manager manager) {
        String username = HanyuPinyinHelp.toHanyuPinyin(manager.getMname());
        manager.setUsername(username);
        Md5Hash md5Hash = new Md5Hash("123456");
        manager.setPassword(md5Hash.toString());
        managerMapper.insertSelective(manager);
        return 0;
    }

    @Override
    public List<Classes> getClassesByCourse(String course) {
        List<Classes> classes = classesMapper.getClassesByCourse(course);

        return classes;
    }

    @Override
    public Classes getClassesById(Integer cid) {
        Classes clazz = classesMapper.selectByPrimaryKey(cid);
        return clazz;
    }
}
