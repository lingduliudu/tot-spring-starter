package tot.spring.starter.job.annotation;

import org.springframework.context.annotation.Import;

import tot.spring.starter.job.config.ConditionalClass;

@Import(ConditionalClass.class)
public @interface EnableJobClient {

}
