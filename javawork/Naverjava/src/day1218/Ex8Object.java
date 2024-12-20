package day1218;

class Orange
{
	public static final String MESSAGE = "HAPPY"; //final상수만 접근 가능
			
	private String name; 
	private int age;
	//얘네는 초기값 null
	public void showData()
	{
		//일반 멤버 메소드는 this라는 인스턴스 변수를 가지고 있다
		//static 멤버 메소드에는 this가 없음
		//그래서 this.name 이런식으로 접근 가능(this는 경우에 따라 생략 가능)
		//System.out.println("이름:" +this.name+",나이:"+this.age);
		System.out.println("이름:" +name+",나이:"+age);//똑같은 이름의 지역변수가 없어서 this생략가능
	} 		
	
	
	//값을 변경하기 위한 setter method를 만들어보자(규칙이 있움)
	//변수명 만드는 규칙: 두단어일때 2번째단어 첫글자 대문자
	public void setName(String name)
	{
		//같은 구역의 멤버와 같은 이름의 변수가 있을 경우
		//멤버변수 앞에 반드시 this를 붙인다
		this.name = name;
	}
	
	public void setAge(int age)
	{ 
		//this age+파라미터값age를 받음
		this.age = age;
	}
	
}

public class Ex8Object {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Orange.MESSAGE); //상수 값을 가져오는 것만 가능
		//메인 안에서 값을 안주면 출력 자체가 오류
		
		Orange orange = new Orange();
//		System.out.println(orange.name); //오류
		//영역을 볼 수 없다고 오류뜸..
		//private 변수는 직접 접근 불가
		orange.showData();
		System.out.println("값변경");
		//메소드를 통해 멤버변수 변경(아래)
		orange.setName("김태희");
		orange.setAge(35);
		
		orange.showData();
		
		
	
	}

}
