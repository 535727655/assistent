package com.doublek.assistent.controller;

import com.doublek.assistent.adapter.RoleAdapter;
import com.doublek.assistent.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User: Ousion
 * Date: 2019/8/28
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleAdapter roleAdapter;

    @GetMapping("/getAll")
    public Response getAll() {
        Response result = roleAdapter.getAll();
        return result;
    }
}
