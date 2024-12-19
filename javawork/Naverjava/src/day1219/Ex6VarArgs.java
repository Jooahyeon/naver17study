package day1219;

public class Ex6VarArgs {
	
	public static void writeColor(String color1)
	{
		System.out.println("color1="+color1);
	}
	
	public static void writeColor(String color1, String color2)
	{
		System.out.println("color1="+color1+"color2="+color2);
	}
	
	public static void writeColor(String color1,String color2,String color3)
	{
		System.out.println("color1="+color1+"color2="+color2+"color3="+color3);
	}
	
	public static void writeName(String ...name)
	{
		System.out.println("name의 length:"+name.length);
		if(name.length==0)
			System.out.println("멤버가 없습니다");
		else {
			System.out.println("**멤버목록**");
			for(String n:name)
				System.out.println("\t"+n);
			System.out.println("=".repeat(20));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeColor("red");
		writeColor("yello","green");
		// writeColor("white","orange","black","red"); //오류발생->해당오버로딩메서드가 존지하지 않음.
		
		System.out.println("Variable Arguments 기능을 이용해서 인자로 여러 문자열 만들기");
	      writeName("이미자");
	      writeName("손예진","한고은");
	      writeName("캔디","마이클","캐서린","아담스");
	      writeName();
	}

}
