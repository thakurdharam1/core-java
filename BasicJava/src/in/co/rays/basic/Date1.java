package in.co.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) throws ParseException  {
		String s="16/01/2024";
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date d=sdf.parse(s);
		Calendar c=Calendar.getInstance();
		c.setTime(d);
		for (int i = 1; i <5; i++) {
			c.add(Calendar.DATE,31 );
			System.out.println(c.getTime());
			
		}
		
		

		
		 
		 

	}

}
