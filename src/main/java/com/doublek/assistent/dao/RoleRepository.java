package com.doublek.assistent.dao;

import com.doublek.assistent.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: Ousion
 * Date: 2019/8/28
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
