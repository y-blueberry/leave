package com.yj2.leave.mapper;

import com.yj2.leave.entity.User;


public interface UserDefinedMapper {
    User getUserByAccount(String account);
}
