package com.demo.model;

import java.util.Date;

public class User {

    public User(String userNo,String name, Integer age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.userNo = userNo;
    }

    public User() {
    }

    private String userNo;
    private String name;
    private Integer age;
    private Date birthDate;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNo='" + userNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }
}
