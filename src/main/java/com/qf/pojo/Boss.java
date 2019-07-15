package com.qf.pojo;

public class Boss {
    private Integer bid;

    private String bname;

    private String bsex;

    private String bage;

    private String state;

    private String username;

    private String password;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    public String getBsex() {
        return bsex;
    }

    public void setBsex(String bsex) {
        this.bsex = bsex == null ? null : bsex.trim();
    }

    public String getBage() {
        return bage;
    }

    public void setBage(String bage) {
        this.bage = bage == null ? null : bage.trim();
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