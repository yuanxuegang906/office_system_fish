package com.qf.service;

import com.qf.pojo.Leave;

import java.util.List;

public interface LeaveService {
    int addStuentLeave(Leave leave);
    int addStaffLeave(Leave leave);
    List<Leave> leaveList(String username);
    int updateLeave(Integer lid, String username);
    List<Leave> myLeave(String username);
}
