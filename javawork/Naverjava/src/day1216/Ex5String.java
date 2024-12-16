package day1216;

public class Ex5String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 클래스의 멤버 메소드에 대한 공부");
		String str1 = "Apple";
		String str2 = "Have a Nice day!!";
		String str3 = "Orange";
		String str4 = new String("Apple");
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		System.out.println("str1="+str1);
		
		System.out.println("str2 의 길이 : "+str2.length());
		System.out.println("str1 의 0번글자: "+str1.charAt(0));
		System.out.println("str2 의 3번글자: "+str2.charAt(3));
		System.out.println("str3 의 1번글자: "+str3.charAt(1));
		
		System.out.println(); //아스키코드 활용?
		System.out.println("str1 에서 l의 위치는 :"+str1.indexOf('l')); //3
		System.out.println("str2 에서 a의 위치는 :"+str2.indexOf('a')); //1 : 첫번째 a의 위치 
		System.out.println("str2 에서 마지막 a의 위치는 :"+str2.lastIndexOf('a'));
		System.out.println("str3 에서 x의 위치는 :" +str3.indexOf('x'));// 해당 문자가 없을 경우는 -1이 발생
		System.out.println();
		
		//객체타입에서는 ==동등연산자가 주소를 비교하는 연산자
		//주소를 비교할 뿐 값으로 비교한 것이 아님
		System.out.println(str1==str4);
		System.out.println(str3=="Orange");
		System.out.println(str1=="apple");
		System.out.println();
		//문자열을 정확하게 비교하기 위해서는 equals사용 (대소문자까지 모두 맞아야 true)
		System.out.println(str1.equals(str4)); //true
		System.out.println(str1.equals("apple")); //false -> 대소문자까지 모두 맞아야 true
		//대소문자 섞여있어도 철자만 맞으면  true
		System.out.println(str1.equalsIgnoreCase("apple"));
		System.out.println(str1.equalsIgnoreCase("appLE"));
		
		System.out.println("문자열 비교-compareTo");
		int n=str1.compareTo("Apple");
		System.out.println(n); // 0: 대소문자까지 같은 경우
		
		n=str1.compareTo("Banana");
		System.out.println(n); //문자열 1이 문자열 2보다 작을 경우 마이너스 값 -1: 'A'하고 'B'하고 비교
		
		//거꾸로 된 경우
		n=str3.compareTo(str1); // "Orange", "Apple"을 비교 'O','A'
		System.out.println(n); //알파벳 순서가 거꾸로 되어 있을 경우 양수값 14
		
		
		System.out.println();
		System.out.println("str2 를 모두 대문자로 변환 : "+str2.toUpperCase());
		System.out.println("str2 를 모두 소문자로 변환 : "+str2.toLowerCase());
		
		System.out.println();
		System.out.println("str2가 Have로 시작하면 true:"+str2.startsWith("Have"));//true
		System.out.println("str2가 Happy로 시작하면 true:"+str2.startsWith("Happy")); //false

		System.out.println();
		System.out.println("str2가 Day!!로 끝나면 true:"+str2.endsWith("Day!!"));//true
		System.out.println("str2가 Day!로 끝나면 true:"+str2.endsWith("Day!!"));//false
		
		System.out.println("=".repeat(50));
		System.out.println(str1.repeat(5));
		System.out.println("*".repeat(5));
		
		System.out.println();
		System.out.println(str2.replace("a","*"));
		System.out.println(str2.replace("Nice","Happy")); 
		System.out.println();
		System.out.println(str2.substring(7)); //4번 인텐스부터 끝까지 추출
		System.out.println(str2.substring(7,10));
        
		System.out.println("split으로 문자열 분리(배열)");
		String str5="red,green,blue,yellow,gray,black";
		System.out.println("str6="+str5);
		String []array=str5.split(",");
		//배열출력
		for(String a:array)
			System.out.println(a);
		
		String str6 = "  Hello  ";
				System.out.println("*"+str6+"*");
				System.out.println("*"+str6.trim()+"*"); //공백 제거
				System.out.println();
		System.out.println("String.valueOf: 다양한 타입의 데이타를 String 타입으로 변환");
		//String s1=String.valueOf(100);
		String s1=100+""; //int+String=String :간단한 방법(묵시적 형변환)
		String s2=String.valueOf(true);
		String s3=String.valueOf(34.6);
		String s4=String.valueOf('A');
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}