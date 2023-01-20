package com.example.clienteWebflux;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClienteWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteWebfluxApplication.class, args);
	}

}
