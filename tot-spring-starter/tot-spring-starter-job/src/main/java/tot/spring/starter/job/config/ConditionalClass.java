package tot.spring.starter.job.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

import lombok.extern.slf4j.Slf4j;
import tot.spring.starter.job.constant.ApplicationConstant;

@Slf4j
public class ConditionalClass {
	
	
	@Value("${spring.application.name:null}")
	private String applicationName;

	@PostConstruct
	public void init() {
		log.info("init job starter ...");
		ApplicationConstant.APPLICATION_NAME = applicationName;
	}
	
}