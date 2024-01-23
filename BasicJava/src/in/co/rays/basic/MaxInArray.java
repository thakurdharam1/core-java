package in.co.rays.basic;

public class MaxInArray {

	public static void main(String[] args) {
	int[] a= {5,8,4,9,78,90,56};
	int b=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>b) {
			b=a[i];
		}
		
	}
	System.out.println(b); 
	}

}
