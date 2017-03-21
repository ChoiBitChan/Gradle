package spring.chap02;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Foo {
	
	private String name;
	
	public String getName() {
		return name;
	}

	//@Value("scott")
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	public Foo() {
		System.out.println("Foo 기본 생성자");
	}
	
	public void doFoo() {
		System.out.println(name);
		System.out.println("foo.doFoo()");
	}
	
	
	
	
	@PostConstruct
	public void start() {
		System.out.println("foo.start()");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("foo.stop()");
	}
	
}
