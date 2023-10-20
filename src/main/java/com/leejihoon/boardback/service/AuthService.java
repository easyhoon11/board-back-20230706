package com.leejihoon.boardback.service;

import org.springframework.http.ResponseEntity;

import com.leejihoon.boardback.dto.request.auth.SignInRequestDto;
import com.leejihoon.boardback.dto.request.auth.SignUpRequestDto;
import com.leejihoon.boardback.dto.response.auth.SignInResponseDto;
import com.leejihoon.boardback.dto.response.auth.SignUpResponseDto;

public interface AuthService {

    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);

}
