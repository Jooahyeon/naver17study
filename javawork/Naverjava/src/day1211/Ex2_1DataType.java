package day1211;

public class Ex2_1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 묵시적 형변환
		int kor = 50;
		int eng = 63;
		System.out.println("합계 : "+kor+eng); //Spring형으로 출력
		System.out.println("합계 : "+(kor+eng));

		//진법변환
		int a = 056; //0->8진수
		int b = 0x12a;//0x->16진수
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
