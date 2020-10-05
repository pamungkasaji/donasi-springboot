package com.pamungkasaji.donasi.repository;

import com.pamungkasaji.donasi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
