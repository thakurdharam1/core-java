package in.co.rays.oop;

public class TestConstructor {

	 int id;
	String name;
	public void TestConstructor() {
		System.out.println("no argument constructor");
	}
	public void TestConstructor(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println("parametrised method");
	}

}
