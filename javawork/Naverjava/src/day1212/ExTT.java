package day1212;

import java.util.Date;

public class ExTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today=new Date();
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
		System.out.println("=".repeat(36));
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+"+num2+"="+result);
	}
}
