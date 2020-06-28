package tot.spring.starter.job.config;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.alibaba.fastjson.JSONObject;

import lombok.val;
import lombok.extern.slf4j.Slf4j;
import tot.spring.starter.job.annotation.Job;
import tot.spring.starter.job.bean.Register;
import tot.spring.starter.job.execute.SpringExecute;
import tot.spring.starter.job.feign.JobFeign;

@Slf4j
public class AnalysisConfig {

	@Autowired
	private JobFeign jobFeign;
	
	@Autowired
	private SpringExecute springExecute;
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	@PostConstruct
	public void initAfter() {
		Map<String,Object> beanMap =  springExecute.getApplicationContext().getBeansWithAnnotation(Job.class);
		for(Object obj:beanMap.values()) {
			Job job = obj.getClass().getAnnotation(Job.class);
			Register register = new Register();
			register.setApplicationName(applicationName);
			if(job.bean().equals("")) {
				register.setBeanName(obj.getClass().getSimpleName());
			}else {
				register.setBeanName(job.bean());
			}
			register.setExtData(job.extData());
			register.setMethod(job.method());
			register.setPath(job.path());
			try {
				jobFeign.register(register);
			}catch (Exception e) {
				log.error("连接job服务异常,{}",e.getMessage());
			}
		}
	}
	
}
