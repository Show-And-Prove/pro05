package com.shop.myapp.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Getter
@Setter
public class MemberFormDto {

    //@NotBlank, @Email, @Length 폼 데이터 유효성 검증
    //제약조건 설정

    @NotBlank(message = "Not NULL field")
    private String name;

    @NotBlank(message = "Not NULL field")
    @Email(message = "Email field")
    private String email;

    @NotBlank(message = "Not NULL field")
    @Length(min = 4, max = 12, message = "4자 이상 12자 이하" )
    private String password;

    @NotBlank(message = "Not NULL field")
    private String address;

}