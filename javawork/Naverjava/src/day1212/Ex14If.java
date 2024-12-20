package day1212;

import java.util.Scanner;

public class Ex14If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//string->따옴표차이char
		
		int score;
		String grade;
		
		System.out.println("점수를 입력해주세요");
		score=sc.nextInt();
		
		// 점수가 0~100의 값을 벗어나면 메서드 종료-> 앞에 not(!) 붙이거나 or 사용
		//main=시작(대표)메서드
		//if문 두문자 이상일때 중괄호{}
		
		//방법1
		if(!(score>=0 && score<=100))
		{
			System.out.println("값의 범위를 벗어났습니다");
			return; //현재 메서드를 종료한다 -> 'void'때 사용 가능
		}
		//방법2
		if((score<0 || score>100))
		{
			System.out.println("값의 범위를 벗어났습니다");
			return; //현재 메서드를 종료한다 -> 'void'때 사용 가능
		}
		
		if(score>=90)
			grade="A";
		else if(score>=80)
			grade="B";
		else if(score>=70)
			grade="C";
		else if(score>=60)
			grade="D";
		else
			grade="F";
		
		System.out.printf("%d점의 학점은 %s학점입니다\n",score,grade);
		
	}

}
