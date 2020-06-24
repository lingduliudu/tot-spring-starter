package tot.spring.starter.job.config;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConditionalClass {

	@PostConstruct
	public void init() {
		log.info("init job starter ...");
	}
}