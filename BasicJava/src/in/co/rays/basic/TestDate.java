package in.co.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		//System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String s=sdf.format(d);
		System.out.println(s);

	}

}
