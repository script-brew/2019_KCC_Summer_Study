package com.kcc.kccm_project.Entity;

import com.kcc.kccm_project.util.DateUtil;

public class UserInfo {
    private String schoolNumber;
    private String password;
    private String name;
    private String department;
    private String birthday;
    private String signUpDate;

    public UserInfo() {
        this.signUpDate = DateUtil.today();
    }

    public UserInfo(String schoolNumber, String password, String name, String department, String birthday) {
        this();
        this.schoolNumber = schoolNumber;
        this.password = password;
        this.name = name;
        this.department = department;
        this.birthday = birthday;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }
}
