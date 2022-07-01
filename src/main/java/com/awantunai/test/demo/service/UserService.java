package com.awantunai.test.demo.service;

import com.awantunai.test.demo.dto.UserDto;
import com.awantunai.test.demo.dto.UserSessionDto;

public interface UserService {


    String userSignup(UserDto userDto);

    UserSessionDto userLogin(String emailId, String password);
}
