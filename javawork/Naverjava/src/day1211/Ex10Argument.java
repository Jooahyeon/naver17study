package day1211;

public class Ex10Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("double형 Argument 값 읽기");
		//3과목의 점수를 double형으로 읽어 총점과 평균을 구해보자
		// (계산해야하면 정수 or 실수변경)
		
		double score1=Double.parseDouble(args[0]); //String타입을 double타입으로 변환
		double score2=Double.parseDouble(args[1]);
		double score3=Double.parseDouble(args[2]);
		double total=score1+score2+score3;
		double average=total/3; //자체가 double형이라 변형 필요 없음.
		
		System.out.printf("점수 1 : %5.1f점\n",score1);
		System.out.printf("점수 2 : %5.1f점\n",score2);
		System.out.printf("점수 3 : %5.1f점\n",score3);
		System.out.printf("총점 : %5.1f점\n",total);
		System.out.printf("평균 : %5.1f점\n",average);
		

	}

}
