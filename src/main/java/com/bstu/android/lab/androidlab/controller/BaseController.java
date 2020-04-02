package com.bstu.android.lab.androidlab.controller;

import com.bstu.android.lab.androidlab.model.Response;
import com.bstu.android.lab.androidlab.service.BaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    private BaseService baseService;

    public BaseController() {
        this.baseService = new BaseService();
    }

    @GetMapping("/list")
    public Response getList() {
        return baseService.generateResponse();
    }
}
