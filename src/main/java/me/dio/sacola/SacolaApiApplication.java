package me.dio.sacola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Anotação que determina o tipo da aplicação, nesse caso, uma do tipo SpringBootApplication, e faz com que seja
//importado varios metodos
@SpringBootApplication
public class SacolaApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SacolaApiApplication.class, args);


	}

}
