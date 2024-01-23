package in.co.rays.basic;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		int a=5678;
		int b=a;;
		int c=0;
		int r;
		while(b>0) {
			r=b%10;
			c=c*10+r;
			b=b/10;
		}
		
			System.out.println(c);
		
		}

	}


