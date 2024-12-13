package day1213;

public class Ex6While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		while(a<=90) {
//			System.out.printf("%c",a++);
			//%c 한글자 출력
			System.out.println((char)a++);
		} //(char)사용->아스키코드로 변화됨.
		
		System.out.println();
		char b='a';
		//do-while문을 입력해서 a~z까지 출력하시오
		do {
			System.out.print(b++);
		} while(b<='z');

		
		System.out.println();
		int n=0;
		while(n<=10) {
			n++;
			if(n%2==0)//짝수일 때 실행 안하는 조건
				continue; //조건식으로 이동(while or do-while)
			//'continue'조건식에서 다시 처음으로 돌아갈 때 사용하는 것
			System.out.printf("%3d",n); 
		}
	}

}