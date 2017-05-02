package com.hotel.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.entity.Hotel;
import com.hotel.entity.Hotel_style;
import com.hotel.entity.Pic;
import com.hotel.entity.Room;
import com.hotel.entity.Room_style;
import com.hotel.service.HotelService;
import com.hotel.service.Hotel_styleService;
import com.hotel.service.PicService;
import com.hotel.service.RoomService;
import com.hotel.service.Room_styleService;

@Controller
public class RoomController {

	@Resource 
	private RoomService roomService;
	@Resource
    private HotelService hotelService;
	@Resource
    private PicService picService;
	@Resource
    private Room_styleService r_styleService;
	@Resource
    private Hotel_styleService hotel_styleService;
	
	@RequestMapping("/hotel.do")
	public String findByH_id(@RequestParam(value = "h_id") Integer h_id ,
			 ModelMap model){
		Room room=roomService.findByH_id(h_id);
		Pic pic=picService.findById(room.getPic_id());
		Room_style r_style=r_styleService.findByR_style_id(room.getR_style_id());
		model.addAttribute("r_style",r_style);
		model.addAttribute("pic",pic);
		model.addAttribute("room", room);
		Hotel hotel=hotelService.findById(h_id);
		Hotel_style hotel_style=hotel_styleService.findById(hotel.getStyle_id());
		model.addAttribute("hotel_style", hotel_style);
		model.addAttribute("hotel", hotel);
		return "hotel";
	}
}
