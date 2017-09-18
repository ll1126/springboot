package com.example.demo.Service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.Entity.User;
import com.example.demo.Mapper.UserMapper;
import org.springframework.stereotype.Service;
import  com.example.demo.Service.*;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
