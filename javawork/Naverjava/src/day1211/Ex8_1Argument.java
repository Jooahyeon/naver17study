package day1211;

public class Ex8_1Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("외부에서 값 읽어오기");
		String name=args[0];
		String city=args[1];
		int birthyear = Integer.parseInt(args[2]);
		int age=2024-birthyear; //계산이 필요한 경우(정수형) Integer.parseInt사용
		
		int kor=Integer.parseInt(args[3]);
		int eng=Integer.parseInt(args[4]);
		int total=kor+eng;
		double average=total/2.0;
		
		System.out.println("이름: "+args[0]);
		System.out.println("지역: "+args[1]);
		System.out.println("태어난 년도:"+birthyear+" 나이:"+age);
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("총점:"+total);
		System.out.println("평균:"+average);
		

	}

}
