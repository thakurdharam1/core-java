package in.co.rays.basic;

public class TestFicconacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=a+b;
		
		System.out.print(a+" "+b);
		for (int i = 1; i <10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
