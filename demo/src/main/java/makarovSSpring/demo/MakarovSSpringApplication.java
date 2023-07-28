package makarovSSpring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MakarovSSpringApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/store");

		SpringApplication.run(MakarovSSpringApplication.class, args);
	}

}
