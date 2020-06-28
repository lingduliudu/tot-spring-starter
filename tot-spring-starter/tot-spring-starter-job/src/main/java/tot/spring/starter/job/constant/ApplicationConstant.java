package tot.spring.starter.job.constant;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ApplicationConstant {

	
	// 程序名
	public static String APPLICATION_NAME="null";
	// 远程程序名
	public static String JOB_APPLICATION_NAME="job-service";
	
	// 注册地址
	public static String REGISTER_PATH="register";
	
	// 直接注册地址
	public static String JOB_REGISTER_PATH="";
	
	
	
	
	@Value("${application-service-name:job-service}")
	private String applicationServiceName;
	
	
	@Value("${job.config.job-register-path}")
	private String jobRegisterPath;
	
	@Value("${register-path:register}")
	private String registerPath;

	
	@PostConstruct
	public void initOther() {
		
		this.JOB_APPLICATION_NAME  = applicationServiceName;
		this.REGISTER_PATH = registerPath;
		this.JOB_REGISTER_PATH = jobRegisterPath;
	}
}
