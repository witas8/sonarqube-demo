package mw.course.sonarqube;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
@RequiredArgsConstructor
public class SonarqubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonarqubeApplication.class, args);
	}

}
