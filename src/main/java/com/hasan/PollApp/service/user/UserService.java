package com.hasan.PollApp.service.user;

import com.hasan.PollApp.model.dto.user.UserDto;
import com.hasan.PollApp.util.Operation;


public interface UserService{
    Operation get(Long id);
    Operation getByEmail(String email);
    Operation add(String companyName, UserDto userDto);
    Operation remove(String companyName, Long id);
    Operation addTitle(Long id, String name);
    Operation removeTitle(Long id, String name);
}
