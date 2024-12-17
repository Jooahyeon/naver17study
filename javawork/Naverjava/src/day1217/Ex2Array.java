package day1217;

public class Ex2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch; // 배열선언
		
		ch = new char[4]; // 0~3번 인덱스까지 데이타를 넣을 수 있다
		
		//length 속성으로 사용하는 경우 ()가 없음
		System.out.println("배열크기:"+ch.length);
		
		//배열에 데이터 넣기, 초기값 따로 주는 방법!
		ch[0] = 'H';
	    ch[1] = 65 ;// 'A'  int형인 아스키코드가 출력됨
	    ch[2] = 'x';
	    ch[3] = 't';
	    
	    //출력 #1
	    for(int i=0;i<ch.length;i++) { //배열 for문 사용시 =부호 사용 X
	    	System.out.println("ch["+i+"]="+ch[i]);	
	    System.out.println();
	    }
	    
	    //출력 #2 (값만 출력)
	    for(char a:ch)
	    	System.out.println(a); 
	    
	    System.out.println("=".repeat(30));
	    char []ch2 = new char[5];
	    ch2 = new char[] {'a','n','x', 'y','u'}; //초기값 한번에 주는 방법!(초기식이 이미 있는 경우 new char[]로 갑 변경)
	    for(int i=0;i<ch2.length;i++)
	    {
	    	System.out.println("ch2["+i+"]="+ch2[i]);
	    }
            System.out.println("=".repeat(30));
            char []ch3 = {'s','r','a','d','e'};
	         for(char a:ch3)
	        	System.out.println(a);
	}
} 
