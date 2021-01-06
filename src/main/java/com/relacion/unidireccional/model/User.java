package com.relacion.unidireccional.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int idUser;
	
	@Column(name = "user_name", nullable = false, length = 50)
	private String userName;
	
	@Column(name = "pass_user", nullable = false)
	private String passUser;
	//EL ARGUMNETO REMOVE REMOVERÁ A LA ENTIDAD Y A AQUELLAS CON LAS QUE GUARDA RELACION
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "user_info_id")
	private Info info;

	/*CONSTRUCTORES*/
	public User() {
	}

	public User(int idUser) {
		this.idUser = idUser;
	}

	/*GETTERS & SETTERS*/
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
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

	/*NECESARIOS PARA TRAER UN OBJETO CON LA INFO DEL USUARIO*/
	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
}
