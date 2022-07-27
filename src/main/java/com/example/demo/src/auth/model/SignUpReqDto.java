package com.example.demo.src.auth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class SignUpReqDto {
    private String name;
    private String email;
    private String refreshkey;
}
