package day1213;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for(초기식1;조건식1;증감식1){
		//     명령어1;}     
		for(int i=1;i<=5;i++) //3번째 값은 증감 or 대입 연산자만 입력 가능.
			//i는 해당 for문 안에서만 사용 가능
			System.out.print(i+"  ");
		System.out.println();
		
		for(int i=1;i<=10;i+=2)
			System.out.print(i+"  ");
		System.out.println();
		
		for(int i=10;i>=1;i--)
			System.out.print(i+"  ");
		System.out.println();
		
		for(int i=10;i<=100;i+=10)
			System.out.print(i+"  ");
		System.out.println();

		System.out.println("break");
		for(int i=1;i<=10;i++) {
			System.out.println(i+"  ");
			if(i==5)
				break;
		}
		System.out.println();
		System.out.println("continue");
		for(int i=0;i<=10;i++) {
			if(i%2==1)
				continue; //i++로 이동
			System.out.println(i+"  ");
		}
	}

}
