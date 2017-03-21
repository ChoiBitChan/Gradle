package spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	public static void main(String[] args) {
		
		// ClassPath는 src 경로부터
		Resource resource = new ClassPathResource("applicationContext.xml");
		
		// 컨테이너 선언 (Bean을 만든다)
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		// 컨테이너에서 Bean 가져오기
		WriteArticleService articleService = (WriteArticleService)beanFactory.getBean("writeArticleService");
		
		articleService.write(new Article());
		
	}

}
