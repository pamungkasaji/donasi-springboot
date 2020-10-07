package com.pamungkasaji.donasi.service.impl;

import com.pamungkasaji.donasi.entity.User;
import com.pamungkasaji.donasi.repository.UserRepository;
import com.pamungkasaji.donasi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long aLong) {
        return userRepository.findById(aLong).orElse(null);
    }

    @Override
    public User saveUser(User object) {
        return userRepository.save(object);
    }

    @Override
    public void deleteUser(Long aLong) {
        userRepository.deleteById(aLong);
    }
}
