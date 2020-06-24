package tot.spring.starter.job.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class MonitorImportSelector implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		Class beanClass = ConditionalClass.class;
		RootBeanDefinition beanDefinition = new RootBeanDefinition(beanClass);
		String beanName = StringUtils.uncapitalize(beanClass.getSimpleName());
		registry.registerBeanDefinition(beanName, beanDefinition);
	}

}
