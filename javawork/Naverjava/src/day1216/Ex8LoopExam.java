package day1216;

import java.util.Scanner;

public class Ex8LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름을 입력하면 그 중 "김"씨성을 가진 사람의 인원수
		 * "이"씨 성을 가진 사람의 인원수
		 * 그 이외의 인원수를 각각 구하여 출력하시오
		 * (while문 사용/ 빠져나가는 코드  "끝")
		 * 
		 * 사용 문자열 메소드 : startsWith, equals
		 */
		
		String names;
		int KimCount=0,LeeCount=0,otherCount=0;
 		Scanner sc=new Scanner(System.in);
 		
// 		while (true)
// 		{ 
// 			System.out.println("이름을 입력하시오");
// 			names=sc.nextLine();
// 			if (names.startsWith("김")) {
// 			KimCount++;
// 			System.out.println("김 " + KimCount);
// 		} else if (names.startsWith("이")){
// 			LeeCount++;
//			System.out.println("이 " + LeeCount);
// 		} else 
// 			
		
 		while (true)
 		{ 
 			System.out.println("이름을 입력하시오");
 			names=sc.nextLine();
 			if(names.equals("끝")) // equals 는 정확하게 똑같으면 나옴
 				break; 			
 			if (names.startsWith("김")) 
 			KimCount++;
 		    else if (names.startsWith("이"))
 			LeeCount++; 			
			else
			otherCount++;
 		}
 		
 		System.out.println("김 " + KimCount);
 		System.out.println("이 " + LeeCount);
 		System.out.println("김씨,이씨를 제외한 인원수 " + otherCount);
	}

}
