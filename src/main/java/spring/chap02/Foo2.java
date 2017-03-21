package spring.chap02;

import org.springframework.stereotype.Component;

public class Foo2 {
	
	private String name;

	public Foo2() {
		System.out.println("Foo2 기본 생성자");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
