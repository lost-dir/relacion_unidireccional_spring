package com.relacion.unidireccional.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info")
public class Info {
	//NO SE AGREGÓ NINGUNA ANOTACIÓN PARA LA RELACIÓN DE LAS TABLAS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_info")
	private int idInfo;
	
	@Column(name = "age_user", nullable = false)
	private int ageUser;
	
	@Column(name = "dir_user", nullable = false, length = 50)
	private String dirUser;
	//PARA DEMOSTRACIÓN: EL USUARIO PUEDE O NO UTILIZAR UNA IMAGEN
	@Column(name = "img_user")
	private String imgUser;
	
	@Column(name = "gender_user", nullable = false)
	private char genderUser;

	/*CONSTRUCTORES*/
	public Info() {
	}

	public Info(int idInfo) {
		this.idInfo = idInfo;
	}

	/*GETTERS & SETTERS*/
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
