package com.hotel.Controller;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.entity.myOrder;
import com.hotel.service.MyOrderService;
import com.hotel.service.StayInfoService;

@Controller
public class OrderController {

	@Resource 
	private MyOrderService myOrderService;
	@RequestMapping("/order.do")
	public String fillOrder(@RequestParam(value = "r_id") Integer r_id ,@RequestParam(value = "uid") Integer uid ,
			 ModelMap model){
		myOrder myOrder=new myOrder();
		myOrder.setOid(1);
		myOrder.setO_num("122121223");
		if(r_id!=null){
			myOrder.setR_id(r_id);
		}else{
			System.out.print("r_id为空");
			return "error";
		}
		if(uid!=null){
			myOrder.setUid(uid);
		}else{
			System.out.print("ud为空");
			return "error";
		}
		myOrder.setBookTime(new Date());
		myOrder.setO_state("填写订单");
		myOrder.setO_quantity(1);
		myOrder.setFreakfast(false);
		System.out.print(myOrder.getOid());
		myOrderService.save(myOrder);
		model.addAttribute("myOrder", myOrder);
		model.addAttribute("oid", myOrder.getOid());
		model.addAttribute("uid", uid);
		return "order";
		
	}
}
