package top.chuckfang.springbootmybatisdruidstarter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import top.chuckfang.springbootmybatisdruidstarter.domain.User;
import top.chuckfang.springbootmybatisdruidstarter.mapper.UserMapper;
import top.chuckfang.springbootmybatisdruidstarter.service.UserService;


/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-21 22:10
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(String id) {
        System.err.println("根据id=" + id + "获取用户对象，从数据库中获取");
        Assert.notNull(id, "id不能为空");
        return userMapper.find(id);
    }
}
