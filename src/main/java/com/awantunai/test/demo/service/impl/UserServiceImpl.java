package com.awantunai.test.demo.service.impl;

import com.awantunai.test.demo.dto.UserDto;
import com.awantunai.test.demo.dto.UserSessionDto;
import com.awantunai.test.demo.entity.Token;
import com.awantunai.test.demo.entity.User;
import com.awantunai.test.demo.repository.UserRepo;
import com.awantunai.test.demo.service.UserService;
import com.awantunai.test.demo.util.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

   /* @Autowired
    UserRepo userRepo;*/

    Utils utils = new Utils();

    @Override
    public String userSignup(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        try{
            //userRepo.save(user);
            return "Signup successful";
        } catch (Exception e){
            return "Signup unsuccessful";
        }
    }

    @Override
    public UserSessionDto userLogin(String emailId, String password){
        User user = new User(1, "rishabhaaditya36@gmail.com", "1234ABCD", "Good Job", "Kolkata", "Male");

        if(emailId.equals(user.getEmailId()) && password.equals(user.getPassword())){
            UserDto userDto = new UserDto();

            BeanUtils.copyProperties(user, userDto);
            userDto.setPassword(null);

            Token token = new Token(utils.getAlphaNumericString(6), LocalDate.now());
            UserSessionDto userSessionDto = new UserSessionDto(userDto, token);
            return userSessionDto;
        }
        return null;
    }


}
