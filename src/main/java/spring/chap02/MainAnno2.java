package spring.chap02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainAnno2 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("anno.xml");
		Foo2 bar = (Foo2)context.getBean("activeFoo");
		System.out.println("bar.getName() :  " + bar.getName());
		
	}

}
