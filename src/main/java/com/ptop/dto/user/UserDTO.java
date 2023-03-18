package com.ptop.dto.user;

import com.ptop.domain.user.Gender;
import com.ptop.domain.user.JoinType;
import com.ptop.domain.user.UserRole;

import java.time.LocalDateTime;

public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String nickname;
    private String phone;
    private LocalDateTime dateOfBirth;
    private Gender gender;
    private String address;
    private String profile_image;
    private JoinType joinType;
    private UserRole role;
    private LocalDateTime lastLogin;
}
