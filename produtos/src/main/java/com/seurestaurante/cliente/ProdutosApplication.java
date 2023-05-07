package com.seurestaurante.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication()
public class ProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}

}


