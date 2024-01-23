package in.co.rays.basic;

public class TestArmstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=153;
		int n=number;
		int sum=0;
		int r;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		if(sum==number)
		{
				System.out.println("its armstron no");
				}
		else {
					System.out.println("its not armstrong no");
				}

	}

}
