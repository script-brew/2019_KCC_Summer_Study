package com.kcc.kccm_project.controller;

import com.kcc.kccm_project.Entity.UserInfo;
import com.kcc.kccm_project.service.SignService;
import com.kcc.kccm_project.service.logic.ServiceFactoryLogic;

public class SignController {
    private SignService signService;

    public SignController() {
        this.signService = ServiceFactoryLogic.getInstance().createSignService();
    }

    public String signUp(UserInfo userInfo) {
        String response = signService.registerUser(userInfo);

        return  response;
    }
}
