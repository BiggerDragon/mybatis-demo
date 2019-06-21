package com.demo.mapper;

import com.demo.model.User;

public interface UserMapper {

    int insert(User user);

    int update(User user);

    int delete(User user);

    User getOne(String userNo);

}
