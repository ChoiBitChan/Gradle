package spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	public static void main(String[] args) {
		
		// ClassPath�� src ��κ���
		Resource resource = new ClassPathResource("applicationContext.xml");
		
		// �����̳� ���� (Bean�� �����)
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		// �����̳ʿ��� Bean ��������
		WriteArticleService articleService = (WriteArticleService)beanFactory.getBean("writeArticleService");
		
		articleService.write(new Article());
		
	}

}
