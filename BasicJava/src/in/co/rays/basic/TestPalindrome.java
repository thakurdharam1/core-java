package in.co.rays.basic;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=151;
        int b=a;
        int c=0;
		int d;
		while(b>0) {
			d=b%10;
			c=c*10+d;
			b=b/10;
			
		}
		if(c==a) {
			System.out.println("palindrome no");
		}else {
			System.out.println("not palindrome number");
		}

	}

}
