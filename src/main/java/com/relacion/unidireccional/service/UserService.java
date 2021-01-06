package com.relacion.unidireccional.service;

import java.util.List;

import com.relacion.unidireccional.bean.UserBean;

public interface UserService {
	public int saveUser(UserBean userBean);
	public int updateUser(UserBean userBean);
	public UserBean getUser(int idUser);
	public boolean deleteUser(int idUser);
	public List<UserBean> getUsers();
}
