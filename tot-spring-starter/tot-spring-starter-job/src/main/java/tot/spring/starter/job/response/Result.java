package tot.spring.starter.job.response;

import lombok.Data;

@Data
public class Result<T> {

	private String code;
	private String msg;
	private T obj;
	
}
