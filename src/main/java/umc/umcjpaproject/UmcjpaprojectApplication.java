package umc.umcjpaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UmcjpaprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmcjpaprojectApplication.class, args);
	}

}
