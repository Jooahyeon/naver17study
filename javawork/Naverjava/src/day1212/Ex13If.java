package day1212;

import java.util.Scanner;

public class Ex13If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,max;
		System.out.println("두 수를 입력해주세요");
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>y)//if문 뒤에는 ; 쓰지마
			max=x;
		else //그렇지않으면
			max=y;
		System.out.println("더 큰수는 "+max+" 입니다");
		

	}

}
