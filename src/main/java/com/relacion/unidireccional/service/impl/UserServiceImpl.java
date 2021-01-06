package com.relacion.unidireccional.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relacion.unidireccional.bean.UserBean;
import com.relacion.unidireccional.model.User;
import com.relacion.unidireccional.repository.UserRepository;
import com.relacion.unidireccional.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public int saveUser(UserBean userBean) {
		User user = new User();
		user.setUserName(userBean.getUserName());
		user.setPassUser(userBean.getPassUser());
		user.setInfo(userBean.getInfo());
		
		this.userRepo.save(user);
		return user.getIdUser();
	}

	@Override
	public int updateUser(UserBean userBean) {
		User user = this.userRepo.findById(userBean.getIdUser()).orElseThrow();
		user.setUserName(userBean.getUserName());
		user.setPassUser(userBean.getPassUser());
		user.setInfo(userBean.getInfo());
		
		this.userRepo.save(user);
		return user.getIdUser();
	}

	@Override
	public UserBean getUser(int idUser) {
		User user = this.userRepo.findById(idUser).orElseThrow();
		UserBean userBean = new UserBean();
		userBean.setIdUser(user.getIdUser());
		userBean.setUserName(user.getUserName());
		userBean.setPassUser(user.getPassUser());
		userBean.setInfo(user.getInfo());
		
		return userBean;
	}

	@Override
	public boolean deleteUser(int idUser) {
		User user = this.userRepo.findById(idUser).orElseThrow();
		
		this.userRepo.delete(user);
		return true;
	}

	@Override
	public List<UserBean> getUsers() {
		List<User> userList = this.userRepo.findAll();
		List<UserBean> userBeanList = new ArrayList<>();
		for(int i = 0; i < userList.size(); i++) {
			UserBean userBean = new UserBean();
			userBean.setIdUser(userList.get(i).getIdUser());
			userBean.setUserName(userList.get(i).getUserName());
			userBean.setPassUser(userList.get(i).getPassUser());
			userBean.setInfo(userList.get(i).getInfo());
			
			userBeanList.add(userBean);
		}
		return userBeanList;
	}

}
