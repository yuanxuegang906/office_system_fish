package com.qf.controller;

import com.qf.util.HanyuPinyinHelp;

/*
 * author:袁学港
 * Date:2019/7/15 14:58
 * info:
 * */
public class Test {
    public static void main(String[] args) {
        String s = HanyuPinyinHelp.getPinyinString("赵兴康");
        System.out.println("s = " + s);
    }
}
