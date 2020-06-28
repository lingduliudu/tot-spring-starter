package tot.spring.starter.job.bean;

import lombok.Data;

@Data
public class Register {
	private String applicationName;
	private String path;
	private String method;
	private String beanName;
	private String extData;
}
