package day1213;

public class Ex5While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//while은 조건이 맞지 않으면 한번도 실행하지 않고 빠져나온다
		while(a<10) {
			System.out.println("while loop");
		}

		//do-while은 일단 한번 실행 후 조건을 비교함
		//즉, 조건이 맞지 않아도 최소 한번은 문장이 실행됨.
		do {
			System.out.println("do-while loop");
		}while(a<10);
		
		//1~10까지 출력
		a=1; 
		while(a<=10) {
			System.out.printf("%3d",a++);
		}
		System.out.println();
		a=1;
		while(true)
			// true로 작성시 무조건 실행 but, break를 꼭 붙일 것
		{
			System.out.printf("%3d",a++); //후치
			if(a>10)
				break;
		}
		System.out.println(); // (me)왜 먼저 나오지?
		a=0;
		while(a<10) { //while 뒤 실수로 ; 적으면 무한루프 돈다!
			System.out.printf("%3d",++a); //전치
		}
		System.out.println();
		a=1;
		do {
			System.out.printf("%3d",a++);
		}while(a<=10);
	}

}
