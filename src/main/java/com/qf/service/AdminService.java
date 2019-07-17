package com.qf.service;

import com.qf.pojo.Classes;
import com.qf.pojo.Manager;
import com.qf.pojo.Student;
import com.qf.pojo.Teacher;

import java.util.List;

public interface AdminService {
    List<Student> getStudents();
    List<Teacher> getTeachers();
    List<Manager> getManagers();
    List<Classes> getClasses();
    int addClasses(Classes classes);
    int delClasses(int cid);
    int delStudent(int sid);
    int delTeacher(int tid);
    int delManager(int mid);
    int updatePassword(int sid);
    int updateManagerPassword(int mid);
    int updateTeacherPassword(int tid);
    List<Student> selectStudentByName(String name);
    List<Teacher> selectTeacherByName(String name);
    List<Manager> selectManagerByName(String name);
    int updateClasses(Classes classes);
    int addTeacher(Teacher teacher);
    int addManager(Manager manager);
    List<Classes> getClassesByCourse(String course);
    Classes getClassesById(Integer cid);

}
