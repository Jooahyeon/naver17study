package day1213;

import java.util.Scanner;

public class Ex9While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1글자씩 입력하다가 x(대소문자 상관없음)를 입력하면 빠져나와서
		 * 입력한 데이터들을 분석한 결과를 출력하시오
		 * 
		 * 대문자:3
		 * 소문자:4
		 * 숫자 :3
		 */
		//내가 푼 식 -> 9_1 강사님 식
		Scanner sc=new Scanner(System.in);
		
		char code;

		while(true) {
			System.out.println("글자 입력");
			code=sc.nextLine().charAt(0);
			
			if((65<=code) & (code<=90)) {
				break;
			}
			System.out.printf("%c:3\n",code);
			
			if((97<=code) & (code<=122)) {
				break;
		}
			System.out.printf("%c:4\n",code);
			
			if((48<=code) & (code<=57)) {
				break;
		}
			System.out.printf("%c:3\n",code);
		
		}

	}

}
 