package day1219;
/*
 * 인자전달방식
 * 값 호출(callByValue) : 값만 전달 (기본형, String)
 * 참조 호출(callByReference) : 주소가 전달(모든 객체, 배열타입)
 * 
 */

class Test
{ 
	String message;
	int code;
}

public class Ex5CallBy {
	
	
	public static void changeInt(int n) 
	// 주소가 다르게 새로 생성 (main 값이 변경되는게 아님)
	
	{
		n=200;
	}
	
	public static void changeString(String s) 
	// 주소가 다르게 새로 생성 (main 값이 변경되는게 아님)
	
	{
		s="apple";
	}
	
	public static void changeTest(Test t) 
	
	{
		t.message = "Happy";
		t.code = 100;
	}
	
	public static void changeArray(int [] arr) 
	
	{
		arr[1] = 20;
	}
	
	public static int changeScore(int score) 
	
	{ //  callbyvalue 인경우  return값을 받아야만 값이 전달됨....
		if(score>=80)
			return score;
		else
			return 90;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100;
		changeInt(n);
		System.out.println("n="+n);
		// 값만 전달
		
		String s = "Berry"; //서로 생성되는 주소가 다름
		changeString(s);
		System.out.println("s="+s);
		
		
		Test t = new Test();
		System.out.println("message="+t.message+",code="+t.code);
		changeTest(t); //주소가 전달
		System.out.println("message="+t.message+",code="+t.code);
		
		//배열
		int []a = {5,8,11}; // 배열이 되면 레퍼런스 타입이 된다
		changeArray(a); //그래서 주소가 전달 
		for(int aa:a)
			System.out.println(aa+"  ");
		  System.out.println();
		  
		  int score = 70;
		  //값만 전달되는 경우 메서드에서 변경된 갑을 받으려면 
		  //리턴으로 받아야함
		  score = changeScore(score);
		  System.out.println("score="+score);
		  
		  
		  
	}   

	}
	


