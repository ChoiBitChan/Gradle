package spring.chap02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainAnno {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("anno.xml");
		Bar bar = context.getBean("bar", Bar.class);
		
		//bar.doBar();
		
		Foo bar2 = (Foo)context.getBean("scottFoo");
		System.out.println(bar2.getName());
		
		context.close();
	}
}
