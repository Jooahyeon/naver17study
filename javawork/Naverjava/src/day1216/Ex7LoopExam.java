package day1216;

import java.util.Scanner;

public class Ex7LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 지수승구하기 2.팩토리알 구하기 3.원의 넓이 구하기 4. 종료
		 * while 반복문에서 위의 메뉴가 나오면 번호를 입력하고 해당 데이터를 입력 후
		 * 결과값을 출력하시오
		 * 
		 * switch 문
		 * 1번 : 두 수 x,y를 입력 후 x의 y승(for문)을 구하여 출력하시오.
		 * 2번 : 숫자 n을 입력 후 n!값을 구하시오(for문)
		 * 3번 : 반지름 r을 입력하면 원의 넓이를 구해서 출력(반지름*반지름(Math.PI)
		 * 그 이외이 값이 들어오면 "종료합니다" 출력 후 프로그램을 종료하시오.
		 * #Math.PI = 3.141592
		 */
		
		Scanner sc= new Scanner(System.in);
		int x,y,result; //1번에 필요한 변수
		int n, fact=1; //2번
		int r;
		double area; //3번
		int menu; //4번
		
       Loop:
		while(true)
			{
			System.out.println("1. 지수승구하기 2.팩토리알 구하기 3.원의 넓이 구하기 4. 종료");
			menu=sc.nextInt();
			switch(menu) {
			
//			System.out.println("두 수 x와 y를 입력하시오");
//			x=sc.nextInt();
//			y=sc.nextInt();
//			
//			for(int i=1;i>0;i++) {
//				result = x * y;
		
			case 1: 
				result=1; //초기값을 줘야 다시 시작 가능
				System.out.println("두 수 x, y 입력");
				x=sc.nextInt();
				y=sc.nextInt();
				for(int i=1;i<=y;i++)
					result*=x;
				System.out.println(x+"의"+y+"승은"+result+"입니다");
			 break;
			
			case 2:
				
//				fact = 1;
//				System.out.println("숫자 n을 입력하시오");
//				n=sc.nextInt();
//				for (int i=1;i<n;i++)
//					fact*=n--;
//				System.out.println(n+"!");
				
				fact = 1;
				System.out.println("숫자 n을 입력하시오");
				n=sc.nextInt();
				for(int i=1;i<=n;i++)
					fact*=i;
					System.out.println(n+"!="+fact);
				break;
				
			case 3:
				System.out.println("원의 반지름 입력");
				r=sc.nextInt();
				area=r*r*Math.PI;
				System.out.println("반지름 "+ r +"인 원의 넓이는 "+area+"입니다");
				break;
			default:
				System.out.println("프로그램을 종료합니다");
				break Loop;
			
			}
		}

	}

}
