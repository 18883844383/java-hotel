package com.hotel.service;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.hotel.dao.UserDao;
import com.hotel.entity.Condition;
import com.hotel.entity.User;
import com.hotel.exception.ConditionException;
import com.hotel.exception.UpwdException;


@Service
public class UserService {

	@Resource(name="userDao")
    private UserDao userDao;
	
	public List<User> findAll() {
        return userDao.findAll();
    }
	
	public User login(String pid){
		User user=userDao.login(pid);
		if(user == null) {
			System.out.println("鐢ㄦ埛涓嶅瓨鍦�");
            throw new ConditionException("璐﹀彿閿欒");
            
        } else {
            return user;
        }
	}
}
