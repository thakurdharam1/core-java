package in.co.rays.basic;

public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Dharamvir");
		System.out.println(s.length());
		//System.out.println(s.reverse());
		System.out.println(s.charAt(4));
		System.out.println(s.replace(0, 3," raj"));
		System.out.println(args[1]);

	}

}
