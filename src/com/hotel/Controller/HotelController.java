package com.hotel.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;

@Controller
public class HotelController {

	@Resource
    private HotelService hotelService;
	
	@RequestMapping("/index.do")
	public String findAll(ModelMap model){
		List<Hotel> list=hotelService.findAll();
		model.addAttribute("hotelList", list);
		return "index";
		
	}
}
