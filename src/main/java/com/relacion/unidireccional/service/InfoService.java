package com.relacion.unidireccional.service;

import java.util.List;

import com.relacion.unidireccional.bean.InfoBean;

public interface InfoService {
	public int saveInfo(InfoBean infoBean);
	public int updateInfo(InfoBean infoBean);
	public InfoBean getInfo(int idInfo);
	public boolean deleteInfo(int idInfo);
	public List<InfoBean> getUsersInfo();
}
