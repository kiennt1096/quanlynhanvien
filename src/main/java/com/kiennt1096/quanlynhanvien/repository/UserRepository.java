package com.kiennt1096.quanlynhanvien.repository;

import com.kiennt1096.quanlynhanvien.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
