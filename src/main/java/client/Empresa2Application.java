package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Empresa2Application {

	public static void main(String[] args) {
		SpringApplication.run(Empresa2Application.class, args);
	}

}
