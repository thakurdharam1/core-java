package in.co.rays.basic;

public class SumOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int count=0;
		for (int i = 101; i <200; i++) {
			if(i/7==0) {
				sum=sum+i;
				count++;
			}
		}
		System.out.println(sum);

}
}