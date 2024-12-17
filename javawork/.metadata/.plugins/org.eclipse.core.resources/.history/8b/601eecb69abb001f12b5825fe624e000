package day1216;

import java.util.Scanner;

public class Ex6LoopExam {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문자열 str을 입력 후 엔터를 누르면
		 * 문자열을 분석해서 대문자, 소문자, 숫자 각각의 갯수를 구해서
		 * 출력하시오.
		 * 
		 * 사용할 문자 메소드 : length(), if문-> charAt(인덱스)
		 * length를 구해서 for문으로 돌려?!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		int upperCount = 0, lowerCount = 0, numberCount = 0;
//		
//		System.out.println("문자를 입력하시오");
//		str=sc.nextLine();
//		for(int i=0; i<str.length();i++) // 
//		{
//			char ch=str.charAt(i);
//			if(ch>='A' && ch<='Z')
//				upperCount++;
//			else if (ch>='a' && ch<='z')
//				lowerCount++;
//			else if (ch>='0' && ch<='9')
//				numberCount++;
//			
//				if(ch>=65 && ch<=90)
//			    	upperCount++;
//				else if (ch>=97 && ch<=122)
//				    lowerCount++;
//				else if (ch>=48 && ch<=57)
//			     	numberCount++;
//		}
		
		System.out.println("문자를 입력하시오");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++) //왜 i=str이랑 같으면 안되지? i=0이면 아무것도 적을 수 없잖아!
		{ 
			char ch = str.charAt(i); // 이게 왜 여기 들어와?!
			if(ch>= 'A' && ch<= 'Z')
				upperCount++;
			else if(ch>='a' && ch<= 'z')
				lowerCount++;
			else if(ch>'0' && ch<='9') //else가 아니라 else if가 사용되는 이유?!
			    numberCount++;
		}
			
		System.out.println("대문자 갯수:"+upperCount);
		System.out.println("소문자 갯수:"+lowerCount);
		System.out.println("숫  자 갯수:"+numberCount);
		
		

		
		

	}

}
