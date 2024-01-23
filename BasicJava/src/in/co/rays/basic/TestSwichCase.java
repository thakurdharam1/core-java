package in.co.rays.basic;

public class TestSwichCase {

	public static void main(String[] args) {
		int divide=4;
		int a=10;
		int b=20;
		switch(divide) {
		case 1:
			int c=a+b;
			System.out.println("addition="+c);
			break;
		case 2:
			int d=a-b;
			System.out.println("substract="+d);
			break;
		case 3:
			int e=a*b;
			System.out.println("multiply="+e);
			break;
		case 4:
			int f=a/b;
			System.out.println("divide="+f);
			break;
			default:
			System.out.println("not found");
			
		}
		
			

	}

}
