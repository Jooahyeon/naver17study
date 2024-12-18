package day1218;

import java.net.MulticastSocket;

class Apple
{
	//접근지정자(제한자)는 생략시 default가 되는데 같은 패키지에서는
	//private을 제외하고 모두 직접 접근이 가능하다
	static String message = "Hello"; //클래스 멤버변수(static이 붙어서)
	static final String EMP = "비트캠프"; //상수(final이 붙으면 상수)
	String name = "캔디"; //접근제한자?
	
}
///////////////////////////////////////
public class Ex7Object {
	//public이 있어야 다른 패키지에서도 열 수 있움

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다른 클래스의 statici변수는 클래스명.변수명 이렇게 접근한다
		System.out.println("메세지:"+Apple.message);
		System.out.println("EMP:"+Apple.EMP);
		
		Apple.message = "Happy Day"; // 변수명 변경하여 출력가능
//		Apple.EMP = "삼성전자"; //오류:final상수는 값 변경 할 수 없다.
		
		//다른 클래스의 인스턴스 멤버변수를 접근하려면 new로 생성된 클래스 변수가 있어야 한다
		Apple a = new Apple();
		System.out.println("이름="+a.name); //인스턴스 변수는 접근이 가능하여 가져와짐,,
//		System.out.println("이름 = "+Apple.name);//오류, 클래스변수로 못가져옴 인스턴스변수로 가져올 수 있음
		a.name = "미라";
		System.out.println("a의 이름 :"+a.name); //초기값 캔디였는데 미라로 바꿈
		
		Apple b = new Apple();
		b.name = "영자";
		System.out.println("b의 이름:"+b.name); // 미라->영자
	}

}
