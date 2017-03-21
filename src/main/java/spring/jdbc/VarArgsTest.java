package spring.jdbc;

public class VarArgsTest {

	
	public void method1(String s1, String s2) {
		System.out.println(s1 + s2);
	}
	
	public void method1(String s1, String s2, String s3) {
		System.out.println(s1 + s2 + s3);
	}
	
	public void method1(String s1, String s2, String s3, String s4) {
		System.out.println(s1 + s2 + s3 + s4);
	}
	
	
	
	public void method2(String... s1) {
		for (String s : s1) {
			System.out.println(s);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsTest vt = new VarArgsTest();
		vt.method2("1");
		vt.method2("2", "2");
		vt.method2("3", "3", "3");
		vt.method2("4", "4", "4", "4");
	}

}
