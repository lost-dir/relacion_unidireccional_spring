package com.relacion.unidireccional.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.relacion.unidireccional.model.Info;

public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUser;
	
	@NotNull
	@Size(max = 50)
	private String userName;
	
	@NotNull
	private String passUser;
	
	private Info info;

	public UserBean() {
	}

	public UserBean(int idUsuario) {
		this.idUser = idUsuario;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUsuario) {
		this.idUser = idUsuario;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassUser() {
		return passUser;
	}

	public void setPassUser(String passUser) {
		this.passUser = passUser;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
}
