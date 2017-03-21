package spring.DI;

public class Foo {
	
	Bar bar;
	Baz baz;
	
	int i;
	
	void doFoo() {
		System.out.println("i : " + i);
		bar.doIt();
	}
	
	public void doBar() {
		bar = getBar();
		bar.doIt();
	}
	
	public Bar getBar() {
		return null;
	}
	
	
	public Foo() {
		System.out.println("기본 생성자");
	}
	
	Foo(Bar bar, Baz baz) {
		System.out.println("Bar bar, Baz baz");
		this.bar = bar;
		this.baz = baz;
	}
	
	Foo(String a, int b, Bar bar) {
		System.out.println("String a : " + a);
		System.out.println("int b : " + b);
		this.bar = bar;
	}
	
	Foo(String a, String b, Bar bar) {
		System.out.println("String a : " + a);
		System.out.println("String b : " + b);
		this.bar = bar;
	}
	
	
	
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}
	
	public void setBaz(Baz baz) {
		this.baz = baz;
	}
	
	public void setI(int i) {
		this.i = i;
	}

}
