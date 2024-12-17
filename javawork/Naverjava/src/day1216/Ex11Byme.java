package day1216;

import java.util.Calendar;
import java.util.Scanner;

public class Ex11Byme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int year     = now.get(Calendar.YEAR);
		int month    = now.get(Calendar.MONTH);
		int day      = now.get(Calendar.DAY_OF_MONTH)+1;
		int week     = now.get(Calendar.DAY_OF_WEEK);
		int hour     = now.get(Calendar.HOUR);
		int minute   = now.get(Calendar.MINUTE);
		int second   = now.get(Calendar.SECOND);

	}

}
