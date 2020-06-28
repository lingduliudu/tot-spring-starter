package tot.spring.starter.job.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import lombok.extern.slf4j.Slf4j;
import tot.spring.starter.job.constant.ApplicationConstant;
import tot.spring.starter.job.controller.ExecuteController;
import tot.spring.starter.job.execute.SpringExecute;



@Configuration
@ConditionalOnBean(ConditionalClass.class)
@EnableFeignClients(basePackages = "tot.spring.starter.job")
@Import({ApplicationConstant.class,SpringExecute.class,AnalysisConfig.class,ExecuteController.class})
@Slf4j
public class AutoConfig {

}