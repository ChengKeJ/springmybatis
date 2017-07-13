package com.ckj.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckj.ssm.mapper.UserMapper;
import com.ckj.ssm.po.User;
import com.ckj.ssm.service.UserService;

//将这个方法通过Service注解成一个spring bean 然后在后面 通过注解的方式直接使用
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String loginname, String password) {
		// TODO Auto-generated method stub

		return userMapper.findWithLoginnameAndPassword(loginname, password);

	}

}
