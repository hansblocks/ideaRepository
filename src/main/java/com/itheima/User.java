package com.itheima;
/*
 * Package_Name:com.itheima
 * Author:PP_Hu
 * Date:2018/12/18 0018
 * Time:上午 9:06
 */


public class User {
    private String username;
    private Integer age;
    private String address;
    private String password;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
