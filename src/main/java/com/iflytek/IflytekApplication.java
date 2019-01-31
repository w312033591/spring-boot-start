package com.iflytek;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.iflytek.mapper")

public class IflytekApplication {
	public static void main(String[] args) {
		SpringApplication.run(IflytekApplication.class, args);
	}
}

