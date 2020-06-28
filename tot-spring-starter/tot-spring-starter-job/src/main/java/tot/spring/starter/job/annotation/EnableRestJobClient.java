package tot.spring.starter.job.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;

import tot.spring.starter.job.config.MonitorImportSelector;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MonitorImportSelector.class)
@Documented
public @interface EnableRestJobClient {

}
