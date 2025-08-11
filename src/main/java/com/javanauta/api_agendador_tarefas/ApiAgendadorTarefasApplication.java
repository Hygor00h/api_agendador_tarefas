package com.javanauta.api_agendador_tarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiAgendadorTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAgendadorTarefasApplication.class, args);
	}

}
