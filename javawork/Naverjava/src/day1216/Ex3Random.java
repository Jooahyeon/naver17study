package day1216;

import java.util.Scanner;

public class Ex3Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 임의의 난수를 구한 후 숫자 알아맞추기
		 * 맞췄을 경우,
		 *      계속하시겠습니까? y (숫자 입력하다가 문자 입력하는 경우 형변환?)
		 *                => 새로운 난수 발생, 카운트변수 0으로 초기화
		 *      y가 아닐 경우 프로그램 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		int su, rnd, count;
		
		Exit: //레이블은 대소문자 상관없이 임의로 지정하면 됨
			while(true) {
				// 난수 값을 여기서 구함
				rnd = (int)(Math.random()*100)+1;
				count=0; //질문. count++이 아니라 count=0인 이유?  반복문이라서 자동 카운트가 되는건가?
				
				while(true) {
					System.out.println(count +"회 :");
					//su = sc.nextInt();
					su = Integer.parseInt(sc.nextLine());
					if (su>rnd)
					   System.out.println(su+"보다 작습니다");
					else if (su<rnd)
					   System.out.println(su+"보다 큽니다");
					else {
						System.out.println("정답입니다");
						System.out.println("숫자맞추기 게임을 계속하려면 Y, 그만하려면 n");
						char ch = sc.nextLine().charAt(0);
						
						if(ch=='y' || ch=='Y') {
							System.out.println("새로운 난수를 발생합니다");
							break; //현재 속한 while문만 빠져나간다
						}else {
							break Exit; //바깥쪽 while문을 빠져나간다
							 
						}
					} 
					
				}
			}
		System.out.println("프로그램을 종료합니다");
	}

}
