package com.relacion.unidireccional.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relacion.unidireccional.bean.InfoBean;
import com.relacion.unidireccional.model.Info;
import com.relacion.unidireccional.repository.InfoRepository;
import com.relacion.unidireccional.service.InfoService;

@Service
@Transactional
public class InfoServiceImpl implements InfoService {
	
	@Autowired
	private InfoRepository infoRepo;

	@Override
	public int saveInfo(InfoBean infoBean) {
		Info info = new Info();
		
		info.setAgeUser(infoBean.getAgeUser());
		info.setDirUser(infoBean.getDirUser());
		info.setGenderUser(infoBean.getGenderUser());
		info.setImgUser(infoBean.getImgUser());
		
		this.infoRepo.save(info);
		
		return info.getIdInfo();
	}

	@Override
	public int updateInfo(InfoBean infoBean) {
		Info info = this.infoRepo.findById(infoBean.getIdInfo()).orElseThrow();
		
		info.setAgeUser(infoBean.getAgeUser());
		info.setDirUser(infoBean.getDirUser());
		info.setGenderUser(infoBean.getGenderUser());
		info.setImgUser(infoBean.getImgUser());
		
		this.infoRepo.save(info);
		return info.getIdInfo();
	}

	@Override
	public InfoBean getInfo(int idInfo) {
		Info info = this.infoRepo.findById(idInfo).orElseThrow();
		InfoBean infoBean = new InfoBean();
		
		infoBean.setIdInfo(info.getIdInfo());
		infoBean.setAgeUser(info.getAgeUser());
		infoBean.setDirUser(info.getDirUser());
		infoBean.setGenderUser(info.getGenderUser());
		infoBean.setImgUser(info.getImgUser());
		
		return infoBean;
	}

	@Override
	public boolean deleteInfo(int idInfo) {
		Info info = this.infoRepo.findById(idInfo).orElseThrow();
		this.infoRepo.delete(info);
		return true;
	}

	@Override
	public List<InfoBean> getUsersInfo() {
		List<Info> infoList = this.infoRepo.findAll();
		List<InfoBean> infoBeanList = new ArrayList<>();
		for(int i = 0; i < infoList.size(); i++) {
			InfoBean infoBean = new InfoBean();
			infoBean.setIdInfo(infoList.get(i).getIdInfo());
			infoBean.setAgeUser(infoList.get(i).getAgeUser());
			infoBean.setDirUser(infoList.get(i).getDirUser());
			infoBean.setGenderUser(infoList.get(i).getGenderUser());
			infoBean.setImgUser(infoList.get(i).getImgUser());
			
			infoBeanList.add(infoBean);
		}
		return infoBeanList;
	}

}
