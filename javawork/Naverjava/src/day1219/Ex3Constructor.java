package day1219;
/*
 * 생성자란? (보통 생성과 동시 처리해야하는 것들의 값을)
 * 1. 객체 생성시 자동호출됨
 * 2. 리턴타입이 없음(형식 [접근지정자] 클래스명) /리턴값이 없다 -> void
 * 3. 오버로딩(Overloading:중복함수)이 가능하다 -> 생성자가 여러개인 경우가 많음
 * 4. 생성자에서는 주로 멤버변수 초기화를 담당한다-> 초기값 지정, 첫 실행 처리 로직을 줌
 * (setter -> 초기값 필요없을때 사용)
 */

class Apple
{
	Apple() //생성자이름이 클래스이름과 동일해야함
	//각 타입에 맞는 생성자만 호출 가능
	{
		System.out.println("디폴트 생성자");
	}
    	Apple(String name)
	{	
		System.out.println(name+"을 인자로 받음");
	}
     	Apple(int age)
	{
		System.out.println(age+"를 인자로 받음");
	}
     	Apple(String name, int age)
	{
		System.out.println(name+"과"+age+"를 인자로 받음");
	}
}
//////////////////////////////////

public class Ex3Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1 = new Apple(); //생성자 자동 호출 (매개변수 없는 생성자 자동호출)
		Apple a2 = new Apple("강씨");
		Apple a3 = new Apple(40);
		Apple a4 = new Apple("빨강",23);
		
		
	

	}

}
