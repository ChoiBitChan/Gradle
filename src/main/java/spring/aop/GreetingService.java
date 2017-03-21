package spring.aop;

import org.springframework.stereotype.Component;

public interface GreetingService {
	
	public void sayHello(String name) throws Exception;
	
	public void sayGoodbye(String name);

}
