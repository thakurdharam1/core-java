package in.co.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateParse {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//Date d =new Date();
		String s="12/01/2024";
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy");
		Date d=sdf.parse(s);
		System.out.println(d);

	}

}
