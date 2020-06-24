package tot.spring.starter.job.controller;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tot.spring.starter.job.execute.SpringExecute;

@RestController
@RequestMapping("/job-execute")
public class ExecuteController {

	@Autowired
	private SpringExecute springExecute;
	
	@GetMapping("execute")
	public void execute(String beanName,String methodName){
		Object obj = springExecute.getBean(beanName);
		Class cl = obj.getClass();
		try {
			Method method = cl.getDeclaredMethod(methodName);
			method.invoke(obj, new Object[] {});
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
}
