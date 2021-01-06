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
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.relacion.unidireccional.bean.InfoBean;
import com.relacion.unidireccional.service.impl.InfoServiceImpl;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoServiceImpl infoService;
	
	@PostMapping("/saveInfo")
	public ResponseEntity<Integer> saveUser(@Valid @RequestBody InfoBean infoBean){
		return new ResponseEntity<Integer> (this.infoService.saveInfo(infoBean), HttpStatus.OK);
	}
	
	@PutMapping("/updateInfo")
	public ResponseEntity<Integer> updateUser(@Valid @RequestBody InfoBean infoBean){
		return new ResponseEntity<Integer> (this.infoService.updateInfo(infoBean), HttpStatus.OK);
	}
	
	@GetMapping("getInfo/{idInfo}")
	public ResponseEntity<InfoBean> getInfo(@PathVariable("idInfo") int idInfo){
		return new ResponseEntity<InfoBean> (this.infoService.getInfo(idInfo),HttpStatus.OK);
	}
	
	@DeleteMapping("deleteInfo/{idInfo}")
	public ResponseEntity<Boolean> deleteInfo(@PathVariable("idInfo") int idInfo){
		return new ResponseEntity<Boolean> (this.infoService.deleteInfo(idInfo), HttpStatus.OK);
	}
	
	@GetMapping("/getUsersInfo")
	public ResponseEntity<List<InfoBean>> getUsersInfo(){
		return new ResponseEntity<List<InfoBean>> (this.infoService.getUsersInfo(), HttpStatus.OK);
	}
}
