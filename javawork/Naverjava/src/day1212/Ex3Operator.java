package day1212;

public class Ex3Operator {
 //여기에 보통 클래스 변수 부여
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//대입연산자
		int a,b,c,d,e;
		a=b=c=d=e=3; //main 안에 있는 수는 값이 들어가 있어야 오류X
		
		//대입연산,증감연산->초기값 반드시 설정(반복문?)
		a+=5; //a=a+5
		b-=5; //
		c*=5;
		d/=2;
		e%=2;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);

	}

}
