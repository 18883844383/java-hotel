package com.hotel.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hotel.dao.HotelDao;
import com.hotel.entity.Hotel;




@Service
public class HotelService {

	@Resource
    private HotelDao hotelDao;
	
	public List<Hotel> findAll() {
        return hotelDao.findAll();
    }

	public Hotel findById(int r_id) {
		
		return hotelDao.findById(r_id);
	}
}
