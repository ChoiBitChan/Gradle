package spring.DI2;

public class Foo {
	
	Bar bar;
	Baz baz;
	
	public Foo() {
		System.out.println("기본 생성자");
	}
	
	public Foo(Bar bar){
		System.out.println("Bar bar");
		this.bar = bar;
	}
	
	public Foo(Bar bar, Baz baz) {
		System.out.println("Bar bar, Baz baz");
		this.bar = bar;
		this.baz = baz;
	}
	
	void doFoo() {
		bar.doIt();
		baz.doIt();
	}
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}
	public void setBaz(Baz baz) {
		this.baz = baz;
	}
	
}
