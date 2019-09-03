package cn.aa.service.impl;

import cn.aa.dao.UserMapper;
import cn.aa.pojo.User;
import cn.aa.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User getUserByID(int id) {
        return userMapper.getUserByID(id);
    }
}
