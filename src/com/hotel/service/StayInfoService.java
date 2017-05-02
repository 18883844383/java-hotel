package com.hotel.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hotel.dao.StayInfoDao;
import com.hotel.entity.StayInfo;

@Service
public class StayInfoService {
	@Resource
    private StayInfoDao stayInfoDao;
	
	public void save(StayInfo stayInfo){
		stayInfoDao.save(stayInfo);
	}
}
