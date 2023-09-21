package com.lcp.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lcp.app.entity.Role;


public interface RoleRepository extends JpaRepository<Role,Long> {
	Role findByRol(String roleName);
//	List<Role> findByName(String roleName);
}
