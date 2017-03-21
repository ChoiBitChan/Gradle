package spring.chap02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainMoniter {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("moniterContext.xml");
		Moniter moniter = context.getBean("moniter", Moniter.class);
		
		moniter.doMoniter();
		//context.registerShutdownHook();
		context.close();
	}

}
