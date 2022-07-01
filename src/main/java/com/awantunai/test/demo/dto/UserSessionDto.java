package com.awantunai.test.demo.dto;

import com.awantunai.test.demo.entity.Token;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class UserSessionDto {

    private UserDto userDto;

    private Token token;
}
