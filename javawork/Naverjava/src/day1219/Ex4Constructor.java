package day1219;

class Orange {
	private String name;
	private String color;
	private int age;
	
	//생성자
	Orange()
	{
//		this.name = "이말자";
//		this.color = "노랑색";
//		this.age = 30;
		//생성자에서 다른 생성자 호출시 this() 사용
		this("이말자","노랑"); // 인자가 맞는 생성자 한번에 호출
	}

	//생성할때 초기값을 주고 싶을때 파라미터에 지정
	Orange(String name, String color)
	{
		this.name = name;
		this.color = color;
		this.age = 30;
	}
	
	public void writeMember()
	{
		System.out.println("name="+name+",color="+color+",age="+age);
	} //null 값이여도 같은 private로 출력이 가능?
	
	public void writeMember(int n)
	{ //이름은 똑같고 인자가 다른 경우
		if(n==1) {
			System.out.println("이름 : "+name);
			System.out.println("좋아하는 색상 : "+color);
			System.out.println("나이 : "+age);
			System.out.println("*".repeat(20));
		} else if (n==2)
		{
			System.out.println(name+"님은 "+color+"색상을 좋아합니디");
		} else {
			System.out.println("1 or 2만 가능합니다");
		}
	} 
}

public class Ex4Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 없이 생성(default로 생성됨 기능은 없음)
		Orange a1 = new Orange();
		a1.writeMember();
		
		Orange a2 = new Orange("고민시","파랑");
		a2.writeMember();
		a2.writeMember(1);
		a2.writeMember(2);
		a2.writeMember(4);
		

	}

}
