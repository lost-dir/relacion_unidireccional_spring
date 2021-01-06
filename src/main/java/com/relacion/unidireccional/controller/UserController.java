package com.relacion.unidireccional.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relacion.unidireccional.bean.UserBean;
import com.relacion.unidireccional.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<Integer> saveUser(@Valid @RequestBody UserBean userBean){
		return new ResponseEntity<Integer> (this.userService.saveUser(userBean), HttpStatus.OK);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<Integer> updateUser(@Valid @RequestBody UserBean userBean){
		return new ResponseEntity<Integer> (this.userService.updateUser(userBean), HttpStatus.OK);
	}
	
	@GetMapping("getUser/{idUser}")
	public ResponseEntity<UserBean> getUser(@PathVariable("idUser") int idUser){
		return new ResponseEntity<UserBean> (this.userService.getUser(idUser), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteUser/{idUser}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("idUser") int idUser){
		return new ResponseEntity<Boolean> (this.userService.deleteUser(idUser), HttpStatus.OK);
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<UserBean>> getUsers(){
		return new ResponseEntity<List<UserBean>> (this.userService.getUsers(), HttpStatus.OK);
	}
}
