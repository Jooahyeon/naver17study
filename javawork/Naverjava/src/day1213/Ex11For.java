package day1213;

public class Ex11For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print일때 int->char사용하려면 형변환 필요
		System.out.println("알파벳 반복해서 출력하기");
		for(int i=65;i<=90;i++)
			System.out.print((char)i);
		System.out.println();
		for(char ch='A'; ch<='Z';ch++)
			System.out.print(ch);
		System.out.println();
		
		for(int i=90;i>=65;i--)
			System.out.print((char)i); 
		//숫자이니까 문자로 나오게 (char)형변환
		System.out.println();
		
		for(char ch='Z';ch>='A';ch--)
			System.out.print(ch);
		
	}

}
