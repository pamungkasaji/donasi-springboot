package com.pamungkasaji.donasi.service;

import com.pamungkasaji.donasi.entity.Konten;
import com.pamungkasaji.donasi.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    User findUserById(Long id) throws Exception;

    User saveUser(User user);

    void deleteUser(Long id);
}
