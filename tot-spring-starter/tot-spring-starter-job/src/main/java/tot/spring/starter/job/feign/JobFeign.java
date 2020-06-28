package tot.spring.starter.job.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tot.spring.starter.job.bean.Register;

@FeignClient(name = "job-service")
public interface JobFeign {
	
	@PostMapping("register")
	public void register(@RequestBody Register register);
	

}
