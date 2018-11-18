package com.xjxspace.model;

import java.util.Date;

public class Student {
    private int stuNum;

    private String stuName ;

    private int age;

    private boolean isMan ;

    private Date birthday;

    public Student(int stuNum, String stuName, int age, boolean isMan, Date birthday) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.age = age;
        this.isMan = isMan;
        this.birthday = birthday;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
