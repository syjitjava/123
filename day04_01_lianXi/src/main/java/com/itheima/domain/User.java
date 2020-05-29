package com.itheima.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer uid;
    private String user_name;
    private String gender;
    private Integer age;
    private String email;
    private String birthday;
    private Integer did;
     private dept dept;

    public com.itheima.domain.dept getDept() {
        return dept;
    }

    public void setDept(com.itheima.domain.dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", user_name='" + user_name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", did=" + did +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
