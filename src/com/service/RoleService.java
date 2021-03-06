package com.service;

import java.util.List;

import com.dao.RoleDao;
import com.po.Role;

public class RoleService {
	private RoleDao roleDao;
	public List<Role> getAllRoles(){
		return roleDao.getAllRoles();
	}
	public String queryNameById(int rid){
		return roleDao.queryNameById(rid);
	}
	public void updateRole(Role role){
		roleDao.updateRole(role);;
	}
	public Role getRoleById(int rid){
		return roleDao.getRolesById(rid);
	}
	public RoleDao getRoleDao() {
		return roleDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	

}
