package spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDI {
	
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		Foo foo = context.getBean("foo", Foo.class);
		
		
		
		//foo.doFoo();
		
		foo.doBar();
	}

}
