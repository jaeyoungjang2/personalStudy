package com.sparta.personalStudy;

import com.sparta.personalStudy.domain.User;
import com.sparta.personalStudy.domain.UserRoleEnum;
import com.sparta.personalStudy.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
@EnableJpaAuditing
public class PersonalStudyApplication {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(PersonalStudyApplication.class, args);
	}
}