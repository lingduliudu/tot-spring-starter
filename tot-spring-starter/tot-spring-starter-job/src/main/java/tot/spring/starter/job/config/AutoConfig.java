package tot.spring.starter.job.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "tot.spring.starter.job")
@ConditionalOnClass(ConditionalClass.class)
public class AutoConfig {
	
}