package day1212;

import java.util.Scanner;
//
public class Ex7Scanner {
//
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //키보드로부터 입력하겠다라는 표시
//		// 키보드입력하겠다=>콘솔창에 입력?
		String word;
		System.out.println("문장을 입력해보세요");
		word=sc.next(); //한 단어만 읽어온다
		System.out.println("내가 입력한 단어는 \""+word+"\"입니다");
//		// "표시=> \" 
//		// ctrl+/ => 주석처리
//
//		
		word=sc.nextLine();//엔터를 누르면 한줄을 통째로 읽어옴
		System.out.println("내가 입력한 문장은 \""+word+"\"입니다");
//		
		int age;
		System.out.println("나이를 입력하세요");
		age=sc.nextInt();
		System.out.println("내 나이는 "+age+"세입니다");
//		//숫자가 아닌 문자 입력시 오류 뜸!/문자열 다음에 숫자는 가능!
	}

}
