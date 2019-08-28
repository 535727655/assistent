package com.doublek.assistent.adapter.impl;

import com.doublek.assistent.adapter.RoleAdapter;
import com.doublek.assistent.domain.Role;
import com.doublek.assistent.model.Response;
import com.doublek.assistent.service.RoleService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Ousion
 * Date: 2019/8/28
 */
@Component("roleAdapter")
public class RoleAdapterImpl implements RoleAdapter {

    @Resource
    private RoleService roleService;

    @Override
    public Response getAll() {
        List<Role> all = roleService.findAll();
        Response<Object> build = Response.builder().data(all).build();
        return build;
    }
}
