package in.co.rays.basic;

public class StarInverseTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
				}
				for (int j2 = 3; j2 >=i; j2--) {
					System.out.print("*");
					}
			
			for (int  j3= 4;  j3>=i; j3--) {
				System.out.print("*");
				
			}
			System.out.println();
			}


	}

}
