package spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCollEx {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		CollEx collex = context.getBean("collection", CollEx.class);
		
		System.out.println(collex.listValue.get(0));
		System.out.println(collex.listValue.get(1));
		System.out.println(collex.mapValue.get("a"));
		System.out.println(collex.mapValue.get("b"));
		System.out.println(collex.propValue.get("a"));
		System.out.println(collex.propValue.get("b"));
	}

}
