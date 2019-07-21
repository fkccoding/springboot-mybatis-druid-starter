package top.chuckfang.springbootmybatisdruidstarter.service;

import top.chuckfang.springbootmybatisdruidstarter.domain.User;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-21 22:06
 */
public interface UserService {
    User findById(String id);
}
