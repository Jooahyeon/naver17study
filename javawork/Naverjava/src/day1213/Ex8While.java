package day1213;

import java.util.Scanner;

public class Ex8While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자 n을 입력하면 1~n까지의 합계 sum을 구해서 출력하시오
		 * 
		 * 예) 100입력시,
		 * 1~100까지의 합계는 5050입니다(printf,while문 사용)
		 */
		
		Scanner sc=new Scanner(System.in);
		int n,start=1,sum=0;//초기값 설정
		System.out.println("숫자 n 입력");
		n=sc.nextInt();
		while(start<=n) {
			sum+=start++;
		}
		
		System.out.printf("1부터 %d까지의 합계는 %d입니다", n, sum);

	}

}
