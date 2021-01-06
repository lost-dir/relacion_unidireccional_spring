package com.relacion.unidireccional.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idInfo;
	
	@NotNull
	private int ageUser;
	
	@NotNull
	@Size(max = 50)
	private String dirUser;
	
	private String imgUser;
	
	@NotNull
	private char genderUser;

	public InfoBean() {
	}

	public InfoBean(int idInfo) {
		this.idInfo = idInfo;
	}

	public int getIdInfo() {
		return idInfo;
	}

	public void setIdInfo(int idInfo) {
		this.idInfo = idInfo;
	}

	public int getAgeUser() {
		return ageUser;
	}

	public void setAgeUser(int ageUser) {
		this.ageUser = ageUser;
	}

	public String getDirUser() {
		return dirUser;
	}

	public void setDirUser(String dirUser) {
		this.dirUser = dirUser;
	}

	public String getImgUser() {
		return imgUser;
	}

	public void setImgUser(String imgUser) {
		this.imgUser = imgUser;
	}

	public char getGenderUser() {
		return genderUser;
	}

	public void setGenderUser(char genderUser) {
		this.genderUser = genderUser;
	}
}
