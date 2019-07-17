package com.qf.service;

import com.qf.mapper.*;
import com.qf.pojo.*;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * author:袁学港
 * Date:2019/7/10 10:14
 * info:
 * */
@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private ManagerMapper managerMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClassesMapper classesMapper;
    @Autowired
    private LeaveMapper leaveMapper;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;

    @Override
    public int addStuentLeave(Leave leave) {
            repositoryService.createDeployment()
                    .addClasspathResource("leave.bpmn")
                    .deploy();
            int  i = leaveMapper.insertSelective(leave);
            Integer lid = leave.getLid();
            Map<String,Object> map = new HashMap<String,Object>();
            StudentExample sexample =new StudentExample();
            sexample.createCriteria().andUsernameEqualTo(leave.getUsername());
            List<Student> students = studentMapper.selectByExample(sexample);
            Student student = students.get(0);
            ClassesExample example = new ClassesExample();
            example.createCriteria().andClassnameEqualTo(student.getClassname());
            List<Classes> classes = classesMapper.selectByExample(example);
            Classes classe = classes.get(0);
            Teacher teacher = teacherMapper.selectByPrimaryKey(classe.getTid());
            Manager manager = managerMapper.selectByPrimaryKey(classe.getMid());
            map.put("student",leave.getUsername());
            map.put("teacher",teacher.getUsername());
            map.put("manager",manager.getUsername());
            map.put("boss","Wang");
            long starttime = leave.getStarttime().getTime();
            long endtime = leave.getEndtime().getTime();
            long time = endtime - starttime;
            int day= (int) (time/(24*60*60*1000));
            map.put("day",day);
            runtimeService.startProcessInstanceByKey("qfleave",lid+"",map);
            String id = taskService.createTaskQuery().taskAssignee(leave.getUsername())
                    .singleResult().getId();
            taskService.complete(id);
            return i;
    }

    @Override
    public int addStaffLeave(Leave leave) {
            repositoryService.createDeployment()
                    .addClasspathResource("leave2.bpmn")
                     .deploy();
            int i = leaveMapper.insertSelective(leave);
            Integer lid = leave.getLid();

            Map<String,Object> map = new HashMap<String,Object>();
            map.put("staff",leave.getUsername());
            map.put("boss","Wang");
            runtimeService.startProcessInstanceByKey("StaffLeave",lid+"",map);
            String id = taskService.createTaskQuery().taskAssignee(leave.getUsername())
                    .singleResult().getId();
            taskService.complete(id);
        return i;

    }


    @Override
    public List<Leave> leaveList(String username) {
        List<Integer> lidlist = new ArrayList<Integer>();
        LeaveExample example = new LeaveExample();
        example.createCriteria().andLidIn(lidlist);
        List<Leave> rlist = null;
        try{
            List<Task> list = taskService.createTaskQuery().taskAssignee(username).list();
            for (Task task:list){
                String processInstanceId = task.getProcessInstanceId();
                String businessKey = historyService.createHistoricProcessInstanceQuery()
                        .processInstanceId(processInstanceId)
                        .singleResult()
                        .getBusinessKey();
                lidlist.add(Integer.valueOf(businessKey));
                rlist = leaveMapper.selectByExample(example);
            }
        }catch (Exception e){

        }


        return rlist;
    }


    @Override
    public int updateLeave(Integer lid,String username) {
        System.out.println("lid = " + lid);
        String processInstanceId = historyService.createHistoricProcessInstanceQuery()
                .processInstanceBusinessKey(lid + "")
                .singleResult().getId();
        String id = historyService.createHistoricTaskInstanceQuery()
                .processInstanceId(processInstanceId)
                .taskAssignee(username)
                .singleResult().getId();
        taskService.complete(id);
        Leave leave = new Leave();
        leave.setLid(lid);
        leave.setFlag(1);
        int i = leaveMapper.updateByPrimaryKeySelective(leave);
        return i;
    }


    @Override
    public List<Leave> myLeave(String username) {
        List<Leave> leaves = leaveMapper.myLeave(username);
        return leaves;
    }


}
