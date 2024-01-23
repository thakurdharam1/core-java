package in.co.rays.basic;

public class SecMaxArray {

	public static void main(String[] args) {
		int[] a= {45,67,89,34,43,56};
		int secmax=0;
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				secmax=max;
				max=a[i];
			}
			if(a[i]>secmax && a[i]<max) {
				secmax=a[i];
			}
			
		}
		System.out.println(secmax);
		
		

	}

}
