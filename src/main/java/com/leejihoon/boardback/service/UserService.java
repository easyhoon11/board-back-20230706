package com.leejihoon.boardback.service;

import org.springframework.http.ResponseEntity;

import com.leejihoon.boardback.dto.request.user.PatchNicknameRequestDto;
import com.leejihoon.boardback.dto.request.user.PatchProfileImageRequestDto;
import com.leejihoon.boardback.dto.response.user.GetSignInUserResponseDto;
import com.leejihoon.boardback.dto.response.user.GetUserResponseDto;
import com.leejihoon.boardback.dto.response.user.PatchNicknameResponseDto;
import com.leejihoon.boardback.dto.response.user.PatchProfileImageResponseDto;

public interface UserService {
    
    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email);
    ResponseEntity<? super GetUserResponseDto> getUser(String email);

    ResponseEntity<? super PatchNicknameResponseDto> patchNickname(PatchNicknameRequestDto dto, String email);
    ResponseEntity<? super PatchProfileImageResponseDto> patchProfileImage(PatchProfileImageRequestDto dto, String email);
    
}
