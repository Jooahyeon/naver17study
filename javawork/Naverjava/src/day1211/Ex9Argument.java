package day1211;

public class Ex9Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 Argument 값 읽기 문제");
		/*
		 *    이상욱
		 *    삼성전자
		 *    홍보부
		 *    89
		 *    100
		 *    74
		 *    
		 *    사원명(name), 회사명(emp), 부서(dep),
		 *    3 과목의 입사시험점수 (score1,score2,score3)
		 *    를 읽어서 위의 데이타와 입사시험의 총합계(total)과
		 *    평균(average)-소숫점 첫째자리까지만 출력(printf로 출력)를 출력하시오.
		 *    
		 */
		
		String name = args[0];
		String emp = args[1];
		String dep = args[2];
		int score1=Integer.parseInt(args[3]); //변환
		int score2=Integer.parseInt(args[4]);
		int score3=Integer.parseInt(args[5]);
		int total=score1+score2+score3; //총점
		double average=total/3.0;
		// total or .0 붙여서 하나는 double 수식하도록 변경	
		
		System.out.println("사원명: "+args[0]);
		System.out.println("회사명: "+args[1]);
		System.out.println("부서명: "+args[2]);
		System.out.println("입사시험점수 1 : "+score1);
		System.out.println("입사시험점수 2 : "+score2);
		System.out.println("입사시험점수 3 : "+score3);
		System.out.println("총합계: "+total+"점");
		System.out.println("평균:" +average+"점");
		System.out.printf("평균: %5.1f점\n",average);
		//소수점 이하가 많은 경우 'printf'로 사용
				
	}

}
