package com.qf.controller;

import com.qf.pojo.Classes;
import com.qf.pojo.Manager;
import com.qf.pojo.Student;
import com.qf.pojo.Teacher;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * author:袁学港
 * Date:2019/7/16 18:44
 * info:
 * */
@Controller
public class AdminController {
   @Autowired
   private AdminService adminService;
   @RequestMapping("studentList")
   public String studentList(Model model){
       List<Student> students = adminService.getStudents();
       model.addAttribute("students",students);
       return "studentList";
   }
    @RequestMapping("managerList")
    public String managerList(Model model){
        List<Manager> managers = adminService.getManagers();
        model.addAttribute("managers",managers);
        return "managerList";
    }
    @RequestMapping("teacherList")
    public String teacherList(Model model){
        List<Teacher> teachers = adminService.getTeachers();
        model.addAttribute("teachers",teachers);
        return "teacherList";
    }
   @RequestMapping(value = "delStudent",produces = "html/text;charset=utf-8")
   @ResponseBody
    public String delStudent(Integer sid){
       int i = adminService.delStudent(sid);
       return "删除成功";
   }
    @RequestMapping(value = "delTeacher",produces = "html/text;charset=utf-8")
    @ResponseBody
    public String delTeacher(Integer tid){
        int i = adminService.delTeacher(tid);
        return "删除成功";
    }
    @RequestMapping(value = "delManager",produces = "html/text;charset=utf-8")
    @ResponseBody
    public String delManager(Integer mid){
        int i = adminService.delManager(mid);
        return "删除成功";
    }
   @RequestMapping(value = "resPassword",produces = "html/text;charset=utf-8")
   @ResponseBody
    public String resPassword(Integer sid){
       adminService.updatePassword(sid);
       return "修改成功";
   }
    @RequestMapping(value = "resManagerPassword",produces = "html/text;charset=utf-8")
    @ResponseBody
    public String resManagerPassword(Integer mid){
       adminService.updateManagerPassword(mid);
        return "修改成功";
    }
    @RequestMapping(value = "resTeacherPassword",produces =  "html/text;charset=utf-8")
    @ResponseBody
    public String resTeacherPassword(Integer tid){
        adminService.updateTeacherPassword(tid);
        return "修改成功";
    }
   @RequestMapping("getStudentByName")
   @ResponseBody
    public List getStudentByName(String name){
       String likeName = "%"+name+"%";
       List<Student> students = adminService.selectStudentByName(likeName);
       return students;
   }
   @RequestMapping("getTeacherByName")
   @ResponseBody
    public List getTeacherByName(String name){
       String likeName = "%"+name+"%";
       List<Teacher> teachers = adminService.selectTeacherByName(likeName);
       return teachers;
   }
   @RequestMapping("getMangerByName")
   @ResponseBody
    public List getManagerByName(String name){
       String likeName = "%"+name+"%";
       List<Manager> managers = adminService.selectManagerByName(likeName);
       return managers;
   }
    @RequestMapping("classesList")
    public String getClassesList(Model model){
        List<Classes> classes = adminService.getClasses();
        model.addAttribute("classes",classes);
        return "classesList";
    }
    @RequestMapping(value = "updateClasses",method = RequestMethod.GET)
    public String updateClasses(Model model,Integer cid){
        Classes clazz = adminService.getClassesById(cid);
        List<Teacher> teachers = adminService.getTeachers();
        List<Manager> managers = adminService.getManagers();
        model.addAttribute("clazz",clazz);
        model.addAttribute("teachers",teachers);
        model.addAttribute("managers",managers);
        return "updateClasses";
    }
    @RequestMapping(value = "updateClasses",method = RequestMethod.POST)
    public String updateClasses(Classes classes){
       adminService.updateClasses(classes);
       return "forward:classesList";
    }
    @RequestMapping(value = "delClasses",produces = "html/text;charset=utf-8")
    @ResponseBody
    public String delClasses(Integer cid){
       adminService.delClasses(cid);
       return "删除成功";
    }

    @RequestMapping("getClassesByCourse")
    @ResponseBody
    public List getClassesByCourse(String course){
        String likeName = "%"+course+"%";
        List<Classes> classes = adminService.getClassesByCourse(likeName);
        return classes;
    }
    @RequestMapping(value = "addClasses",method = RequestMethod.GET)
    public String addClasses(Model model){
        List<Teacher> teachers = adminService.getTeachers();
        List<Manager> managers = adminService.getManagers();
        model.addAttribute("teachers",teachers);
        model.addAttribute("managers",managers);
       return "addClasses";
    }
    @RequestMapping(value = "addClasses",method = RequestMethod.POST)
    public String addClasses(Classes classes){
        int i = adminService.addClasses(classes);
        return "forward:classesList";
    }
}
