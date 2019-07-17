package com.qf.realm;

import com.qf.mapper.*;
import com.qf.pojo.Roles;
import com.qf.pojo.RolesExample;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * author:袁学港
 * Date:2019/7/16 9:42
 * info:
 * */
public class MyRealm extends AuthorizingRealm {
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
    @Autowired
    private RolesMapper rolesMapper;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) principalCollection.getPrimaryPrincipal();
        RolesExample example = new RolesExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<Roles> roles = rolesMapper.selectByExample(example);
        Set<String> roleName = new HashSet<String>();
        for (Roles role:
             roles) {
            roleName.add(role.getRole());
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo(roleName);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String  password ="12345";
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        String identity = (String) session.getAttribute("identity");
        String  username = (String) authenticationToken.getPrincipal();
        switch (identity){
            case "student":
                password = studentMapper.getPassword(username);
                break;
            case "teacher":
                password = teacherMapper.getPassword(username);
                break;
            case "manager":
                password = managerMapper.getPassword(username);
                break;
            case "boss":
                password = bossMapper.getPassword(username);
                break;
            case "admin":
                password = adminMapper.getPassword(username);
                break;
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username,password,"MyRealm");
        return simpleAuthenticationInfo;
    }
}
