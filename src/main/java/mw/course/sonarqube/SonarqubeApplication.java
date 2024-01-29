package mw.course.sonarqube;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SonarqubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarqubeApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			System.out.println("Sonarqube is...");
			wait(1000);
			System.out.println("...suuuuper!");
		};
	}

}
