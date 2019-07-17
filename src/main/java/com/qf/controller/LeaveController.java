package com.qf.controller;

import com.qf.pojo.Leave;
import com.qf.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/*
 * author:袁学港
 * Date:2019/7/10 10:14
 * info:
 * */
@Controller
public class LeaveController {
    @Autowired
    private LeaveService leaveService;
    @RequestMapping(value = "/leave",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String leave(Leave leave, HttpSession session){
        String username = (String) session.getAttribute("username");
        leave.setUsername(username);
        if(leave.getState().equals("student")){
            leaveService.addStuentLeave(leave);
        }
        if (leave.getState().equals("teacher")||leave.getState().equals("manager")){
            leaveService.addStaffLeave(leave);
        }

       return "success";
    }
    @RequestMapping(value = "/leave",method = RequestMethod.GET)
    public String leave(){
        return "leave";
    }
    @RequestMapping(value = "queryLeave")
    public String leaveList(Model model,HttpSession session){
        String username= (String) session.getAttribute("username");
        List<Leave> leaves = leaveService.leaveList(username);
        model.addAttribute("leaves",leaves);
        return "leave_list";
    }
    @RequestMapping(value = "myLeave")
    public String myLeave(Model model,HttpSession session){
        String username = (String) session.getAttribute("username");
        List<Leave> leaves = leaveService.myLeave(username);
        model.addAttribute("leaves",leaves);
        return "myleave";
    }
    @RequestMapping("updateleave")
    @ResponseBody
    public String updateLeave(Integer lid,HttpSession session){
        String username = (String) session.getAttribute("username");
        leaveService.updateLeave(lid,username);
        return "success";
    }

}
