package tot.spring.starter.job.test;

import org.springframework.stereotype.Component;

import tot.spring.starter.job.annotation.Job;

@Job(path = "123",method = "run")
@Component
public class Test1 {

}
