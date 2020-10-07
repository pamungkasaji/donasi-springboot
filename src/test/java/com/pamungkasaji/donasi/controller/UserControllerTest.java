package com.pamungkasaji.donasi.controller;

import com.pamungkasaji.donasi.CreateEntityObject;
import com.pamungkasaji.donasi.entity.User;
import com.pamungkasaji.donasi.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;

    @Autowired
    MockMvc mockMvc;

    User user;
    List<User> userList;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
        user = CreateEntityObject.user();
        user.setId(1L);
        userList = CreateEntityObject.userList();
    }

    @Test
    void userList() throws Exception {
        when(userService.findAllUser()).thenReturn(userList);
        mockMvc.perform(get("/user"))
                .andExpect(status().isOk())
                .andExpect(view().name("user/index"))
                .andExpect(model().attribute("users", hasSize(2)));
    }

    @Test
    void userListInxdex() throws Exception {
        when(userService.findAllUser()).thenReturn(userList);
        mockMvc.perform(get("/user/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("user/index"))
                .andExpect(model().attribute("users", hasSize(2)));
    }

    @Test
    void showUser() throws Exception{
        when(userService.findUserById(anyLong())).thenReturn(user);

        mockMvc.perform(get("/user/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("user/userDetail"))
                .andExpect(model().attribute("user", hasProperty("id", is(1L))));
    }
}