package in.co.rays.basic;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=56789;
		int sum=0;
		int r;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum );

	}

}
