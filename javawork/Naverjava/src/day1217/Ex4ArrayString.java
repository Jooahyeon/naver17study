package day1217;

public class Ex4ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String활용 배열
		String []str1;
		str1 = new String[4];//객체인경우 null값으로 초기값 설정, null인상태에서는 메소드 호출 안됨
		str1[0]="Hello";
		str1[3]="Kitty";
		
		for(int i=0;i<str1.length;i++)
			System.out.println("str1["+i+"]="+str1[i]); //String에 값을 안넣은 경우 null
		System.out.println("=".repeat(30));
		
		String []str2;
		str2 = new String[] {"초록색","분홍색","빨강색","노랑색"};
		for(String s:str2)
			System.out.println(s);
		System.out.println("=".repeat(30));
		
		String []str3 = {"주현욱","주아현","강영미","주영직"};
		for(String s:str3)
			System.out.println(s);
		
	}

}
