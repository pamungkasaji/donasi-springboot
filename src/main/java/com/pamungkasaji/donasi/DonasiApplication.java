package com.pamungkasaji.donasi;

import com.pamungkasaji.donasi.entity.Konten;
import com.pamungkasaji.donasi.service.KontenService;
import com.pamungkasaji.donasi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DonasiApplication {

	private final Logger LOG = LoggerFactory.getLogger(DonasiApplication.class);

	private final UserService userService;
	private final KontenService kontenService;

	public DonasiApplication(UserService userService, KontenService kontenService) {
		this.userService = userService;
		this.kontenService = kontenService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DonasiApplication.class, args);
	}
}
