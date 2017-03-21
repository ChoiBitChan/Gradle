package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingMain {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("aopAnno.xml");
		GreetingService bean = (GreetingService)context.getBean("greetingTarget");
		
		try {
			bean.sayHello("ȫ�浿111");
			bean.sayGoodbye("ȫ�浿222");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
