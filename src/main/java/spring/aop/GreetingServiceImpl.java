package spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("greetingTarget")
public class GreetingServiceImpl implements GreetingService {
	
	@Value("KH")
	private String greeting;
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello(String name) throws Exception {
		System.out.println("sayHello : " + greeting + " = " + name);
		//throw new Exception("강제 예외발생");
	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println("sayGoodbye : " + greeting + " = " + name);
	}

}
