package com.doublek.assistent.service;

import com.doublek.assistent.dao.RoleRepository;
import com.doublek.assistent.domain.Role;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Ousion
 * Date: 2019/8/27
 */
@Service
public class RoleService extends BaseService{

    @Resource
    private RoleRepository roleRepository;


    public List<Role> findAll() {
        List<Role> result = roleRepository.findAll();
        return result;
    }
}
