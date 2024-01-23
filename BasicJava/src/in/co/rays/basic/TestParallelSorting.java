package in.co.rays.basic;

import java.util.Arrays;

public class TestParallelSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,4,9,7,3,6};
		Arrays.parallelSort(a);
		for(int i:a)
		{
			System.out.println(i);
		}
		

	}

}
