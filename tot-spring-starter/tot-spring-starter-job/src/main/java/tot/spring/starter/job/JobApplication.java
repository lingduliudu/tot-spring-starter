package tot.spring.starter.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tot.spring.starter.job.annotation.EnableJobClient;

@SpringBootApplication
@EnableJobClient
public class JobApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobApplication.class, args);
	}
}
