package com.hotel.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hotel.dao.MyOrderDao;
import com.hotel.entity.myOrder;

@Service
public class MyOrderService {
	@Resource
	private MyOrderDao myOrderDao;
	
	public myOrder findById(int oid){
		return myOrderDao.findById(oid);
	}
	
	public void save(myOrder myOrder){
		myOrderDao.save(myOrder);
	}
}
