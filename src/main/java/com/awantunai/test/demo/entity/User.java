package com.awantunai.test.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private int id;

    private String emailId;

    private String password;

    private String jobDescription;

    private String address;

    private String gender;
}
