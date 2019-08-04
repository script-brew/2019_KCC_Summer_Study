package com.kcc.kccm_project.service;

public interface SignService {
    public String signUp(String id, String password, String name, String birthday);
    public String signIn(String id, String password);
}
