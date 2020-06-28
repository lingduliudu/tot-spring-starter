package tot.spring.starter.job.controller;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import tot.spring.starter.job.execute.SpringExecute;
import tot.spring.starter.job.response.Result;

@RestController
@RequestMapping("/job-execute")
public class ExecuteController {

	@Autowired
	private SpringExecute springExecute;

	@GetMapping("execute")
	public Result<String> execute(String beanName, String methodName){
		Result<String> result = new Result<String>();
		try {
			Object obj = springExecute.getBean(beanName);
			Class cl = obj.getClass();
			Method method = cl.getDeclaredMethod(methodName);
			Object  data= method.invoke(obj, new Object[] {});
			result.setObj(JSONObject.toJSONString(data));
			result.setCode("200");
		}catch (Exception e) {
			e.printStackTrace();
			result.setCode("500");
		}
		return result;
	}

}
