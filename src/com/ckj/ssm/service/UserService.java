package com.ckj.ssm.service;

import com.ckj.ssm.po.User;



public interface UserService {

	User login(String loginname,String password);
}
