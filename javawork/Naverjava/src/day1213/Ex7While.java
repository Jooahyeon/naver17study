package day1213;

import java.util.Scanner;

public class Ex7While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//대입,증감연산자 사용시 초기값 반드시 필요
		//total과 count 초기값 설정
		
		int score,total=0,count=0;
		double avg;
		
		while(true)
		{
			System.out.print("점수입력(종료시 0):");
			score=sc.nextInt();
			if(score<0 || score>100) {
				System.out.println("\t잘못 입력된 점수입니다");
				continue; 
				//다시 처음으로 (조건식) 이동 -> 나머지 실행 안됨
			}
			if(score==0) //if문 넣은 순서도 중요
				break;
			
			count++; //++ 1씩 증가
			total+=score; //+=왼쪽 변수에 더하여 대입
		}
		
		avg=(double)total/count;  //0넣을시 분모가 0이라 NaN출력
		//int로 되어있어 소수점까지 안나와서 (double)로 형변환
		
		System.out.println("총 입력한 점수 갯수:"+count);
		System.out.println("점수들의 총 합계:"+total);
		System.out.printf("점수들의 평균 : %5.2f\n",avg);

	}

}
