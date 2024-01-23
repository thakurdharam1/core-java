package in.co.rays.basic;

public class BubbleSort1 {

	public static void main(String[] args) {
		int []a = {3,9,8,5,7};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					a[i]=temp;
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			System.out.println(a[i]);
			
		}

	}

}
