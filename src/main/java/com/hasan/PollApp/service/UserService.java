package com.hasan.PollApp.service;

import com.hasan.PollApp.model.dao.UserEntity;
import com.hasan.PollApp.model.dto.UserDto;

import java.util.List;

public interface UserService{
    UserEntity get(Long id);
    UserEntity getByEmail(String email);
    UserEntity add(UserDto userDto);
    void addTitle(Long id, String name);
    void removeTitle(Long id, String name);
}
