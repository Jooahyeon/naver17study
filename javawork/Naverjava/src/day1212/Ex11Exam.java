package day1212;

import java.util.Date;
import java.util.Scanner;

public class Ex11Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 * 년(year), 월(month), 일(day)를 입력 후
		 * 해당날짜에 대한 Date 클래스를 생성 후 (myDate)
		 * myDate를 이용해서 년도,월,일,요일(week)을 구해서 출력하시오
		 * 요일은 요일숫자로 먼저 얻은 후 요일을 구해서 출력
		 * 
		 */

//		
//		int year,month,day;
//		year=sc.nextInt();
//		System.out.println("현재년도 입력");
//		month=sc.nextInt();
//		System.out.println("현재월 입력");
//		day=sc.nextInt();
//		System.out.println("현재일 입력");
//		
//		
//		Date today=new Date();
//		int curYear=today.getYear()+1900;
//		int curMonth=today.getMonth()+1;
//		int curDate=today.getDate();
//		int weekDay=today.getDay();
//		System.out.println(weekDay);
//		
//		String week=weekDay==0?"일":weekDay==1?"월":weekDay==2?"화":weekDay3?"수":
//			weekDay==4?"목":weekDay==5?"금":"토";
//		
//		System.out.println(today.getYear()+"년도"+today.getMonth()+"월"+today.getDate()+"일"+week+"요일");
//		
//		
//		int curyear=today.getYear()+1900;
//		

		int year,month,day,weekNum;
		String week;
		Date myDate;
		System.out.println("년도 입력");
		year=sc.nextInt();
		System.out.println("월 입력");
		month=sc.nextInt();
		System.out.println("일 입력");
		day=sc.nextInt();
		
		//입력한 날짜에 대한 Date클래스 생성
		myDate=new Date(year-1900, month-1, day);
		
		weekNum=myDate.getDay(); //요일숫자
		
		System.out.println("년도 : "+(myDate.getYear()+1900));
		System.out.println("월 : "+());
		//나머지 남음@
		
	}

}