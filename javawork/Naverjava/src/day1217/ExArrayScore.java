package day1217;

import java.util.Scanner;

public class ExArrayScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 인원수를 입력 후 그 인원수만큼 이름과 점수를 입력하고
		 * 등수와 총점과 평균을 구하여 출력하시오
		 */
		// 계산이 필요한 경우 다 문자열로 선언 후 int로 변형
		
		Scanner sc = new Scanner(System.in);
		int inwon;
		int []score,rank; //앞에 배열표시 하나만 해두면 됨!
		String []name;
		int total = 0;
		double avg;
		
		System.out.println("인원수를 입력하시오");
		inwon =Integer.parseInt(sc.nextLine());	// 계산이 필요한 경우 다 문자열로 선언 후 int로 변형(nextline 사용하는게 좋음)
		//인원수만큼 배열들 할당
		score = new int[inwon];
		rank = new int[inwon];
		name = new String[inwon];
		
		//이름과 점수 입력
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+"번지 이름 입력");
			name[i] = sc.nextLine();
			System.out.println("점수입력");
			score[i] = Integer.parseInt(sc.nextLine());
			
			//합계구하기
			total += score[i];
		}
		
		//평균구하기
		avg = (double)total/inwon;
		
		//등수구하기
		System.out.println();
		for(int i=0;i<score.length;i++)
		{
			rank[i]=1; //기본값 1대입
			for (int j=0;j<score.length;j++)
			{
				if(score[i]<score[j])
					rank[i]++;
			}
//			System.out.println(name[i]+"의 등수:"+rank[i]);
//			System.out.println("-".repeat(40));
		}
		//출력
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("=".repeat(40));
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+1+"\t|"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		System.out.println("=".repeat(40));
		System.out.println("총점 "+total+"\t\t평균"+avg);
		
	}

}