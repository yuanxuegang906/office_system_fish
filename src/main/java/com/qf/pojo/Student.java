package com.qf.pojo;

public class Student {
    private Integer sid;

    private String sname;

    private String ssex;

    private Integer sage;

    private String classname;

    private Integer firststage;

    private Integer secondstage;

    private Integer thirdstage;

    private String state;

    private String username;

    private String password;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getFirststage() {
        return firststage;
    }

    public void setFirststage(Integer firststage) {
        this.firststage = firststage;
    }

    public Integer getSecondstage() {
        return secondstage;
    }

    public void setSecondstage(Integer secondstage) {
        this.secondstage = secondstage;
    }

    public Integer getThirdstage() {
        return thirdstage;
    }

    public void setThirdstage(Integer thirdstage) {
        this.thirdstage = thirdstage;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}