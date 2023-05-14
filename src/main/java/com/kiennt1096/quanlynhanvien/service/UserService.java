package com.kiennt1096.quanlynhanvien.service;

import com.kiennt1096.quanlynhanvien.dto.UserRegistratrionDto;
import com.kiennt1096.quanlynhanvien.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistratrionDto registrationDto);
}
