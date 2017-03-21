package spring.chap02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Configuration
public class Bar {
	
	private Foo foo;
	
	
	@Required
	@Autowired
	//@Qualifier("foo1")
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public void doBar() {
		System.out.println("bar.doBar()");
		foo.doFoo();
	}
	
	@Bean(name="scottFoo")
	public Foo activeFoo() {
		System.out.println("scottFoo.activeFoo()");
		Foo foo = new Foo();
		foo.setName("java");
		return foo;
	}
	
}
