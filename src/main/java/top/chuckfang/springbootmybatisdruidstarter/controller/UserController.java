package top.chuckfang.springbootmybatisdruidstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.chuckfang.springbootmybatisdruidstarter.domain.User;
import top.chuckfang.springbootmybatisdruidstarter.mapper.UserMapper;
import top.chuckfang.springbootmybatisdruidstarter.service.UserService;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-21 22:05
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;

    @GetMapping("/getfromdb")
    public User getfromdb(String id){
        return userMapper.find(id);
    }

}
