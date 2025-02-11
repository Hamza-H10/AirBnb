package fr.codecake.airbnbclone;

import io.github.cdimascio.dotenv.Dotenv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class AirbnbCloneBackApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(AirbnbCloneBackApplication.class, args);
// 	}

// }
// //above is the original code uncomment it and comment the below code to run the application

@SpringBootApplication
public class AirbnbCloneBackApplication {
	public static void main(String[] args) {
		// Only load .env in local environment
		if (System.getenv("CLOUD_ENV") == null) {
			Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
			dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
		}

		SpringApplication.run(AirbnbCloneBackApplication.class, args);
	}
}