package day1212;

public class Ex2Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술 연산자 +,-,*,/,%
		
		int su1=10;
		int su2=4;
		
		System.out.println(su1+su2); 
		System.out.println(su1-su2);
		System.out.println(su1*su2);
		System.out.println(su1/su2); //몫 : 묵시적 형변환에 의해서 결과가 int 타입(2)
		//결과값이 정확하지 않음 -> double로 변환 필요
		System.out.println(su1%su2); //나머지
		System.out.println((double)su1/su2); // double로 바꾸면 결과가 정확
		System.out.println(su1/(double)su2); // 둘 중 하나만 double로 바꿔도 가능
		System.out.println("-----------------------------"); 
		
		int money=3456789;
		System.out.println("금액: "+money+"원");
		System.out.println("만원: "+money/10000+"개");
		System.out.println("천원: "+money%10000/1000+"장"); 
		System.out.println("백원: "+money%1000/100+"개");
		System.out.println("십원: "+money%100/10+"개");
		System.out.println("십원: "+money%10/1+"개");
		//최대한 식은 간편하게 작성하기
	}

}