package tot.spring.starter.job.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Job {
	// 名字
	String name() default "";
	// 注入的bean的名字
	String bean() default "";
	// 调用路径
	String path() default "";
	// 方法
	String method() default "run";
	// 额外参数
	String extData() default "";

}
