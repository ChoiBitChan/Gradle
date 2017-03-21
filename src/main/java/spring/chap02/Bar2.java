package spring.chap02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bar2 {

	private Foo2 foo;
	
	@Required
	@Autowired
	public void setFoo(Foo2 foo) {
		this.foo = foo;
	}
	
	@Bean(name="activeFoo")
	public Foo2 activeFoo() {
		Foo2 foo = new Foo2();
		foo.setName("scott");
		return foo;
	}
} 
