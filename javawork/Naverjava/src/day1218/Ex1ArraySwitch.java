package day1218;

import java.util.Scanner;

public class Ex1ArraySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//book124~125 응용문제
		Scanner sc = new Scanner(System.in);
		/*
		 * 인원수를 입력 후 인원수만큼 이름과 자바, 스프링, 두 점수를 입력 후
		 * 총점,평균,등수,등급을 구하시오 
		 * 
		 */
		int inwon;
		int []java,spring,sum,rank;
		String [] name,grade;
		double [] avg;

		//인원수부터 읽은 후 모든 배열에 메모리 할당하기
		//nextline->int로 변환
		System.out.println("성적을 입력할 인원수는? ");
		inwon = Integer.parseInt(sc.nextLine());

		//메모리 할당
		java = new int[inwon];
		spring = new int[inwon];
		sum = new int[inwon];
		rank = new int[inwon];

		name = new String[inwon];
		grade = new String[inwon];

		avg = new double[inwon];

		//입력 , 총점, 평균
//		for(int i=0;i<inwon;i++) {
//			System.out.println(i+"번째 이름입력");
//			name[i] = sc.nextLine();
//
//			System.out.println(i+"번째 자바점수와 스프링점수 입력");
//			java[i] = Integer.parseInt(sc.nextLine());
//			spring[i] = Integer.parseInt(sc.nextLine());
//
//			sum[i] = java[i]+spring[i];
//			avg[i] = sum[i]/2.0;
//			System.out.println();
//		}
		//등수
		for(int i=0;i<inwon;i++) {
			rank[i] = 1;
			for(int j=0;j<inwon;j++) {
				if(avg[i]<avg[j])
					rank[i]++;   //i<j인 경우 i의 등수가 하나씩 뒤로 밀림(++)
			}
		}

		//등급 (한명이 아닌 여러명이라 for문 사용)
		for(int i=0;i<inwon;i++) {
			//			switch((int)avg[i]/10) {
			//			//double avg을 int로 변환하여 나누기 100->10/99~90->9
			//			
			//			case 10:
			//			case 9:
			//				grade[i] = "우수장학생";
			//				break;
			//			case 8:
			//				grade[i] = "일반장학생";
			//				break;
			//			default:
			//				grade[i] = "해당없음";
			//			}	

			//jdk 12,13에서 추가된 문법
			grade[i] = switch((int)avg[i]/10) {
			case 10,9 -> "우수장학생";
			case 8 -> "일반장학생";
			default -> "해당없음";
			};
		}

		//출력
		System.out.println("번호\t이름\t자바\t스프링\t총점\t평균\t등수\t등급");
		System.out.println("=".repeat(60));
		for(int i=0;i<=inwon;i++) { // = 동등부등호 사용하지 말쟈!ㅜㅜㅜㅜ
			System.out.println(i+1+"\t"+name[i]+"\t"+java[i]+"\t"+spring[i]+"\t"+sum[i]+"\t"+avg[i]+"\t"+rank[i]+"\t"+grade[i]);
		}

	}

}