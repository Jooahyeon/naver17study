package day1212;

public class Ex1Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자(기존 값이 바뀌는 것)
		//++변수(전치:1순위), 변수++(후치:끝순위)
		int a,b,m,n;//선언시 이렇게는 불가. 선언할 때는 따로 써
		a=b=5;
		m=++a; // 1순위, 먼저 a가 증가된 후 m으로 대입
		n=b++; // 끝순위, 먼저 대입 후 b가 증가
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);
		
		a=b=m=n=5;
		m=a++*++b; // 5*6=30
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);

		
		n=a++ + ++b; 
		//a먼저 계산, b나중 계산, 두 값을 더함 (띄어쓰기로 구분)
		//6+7=13
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);
		
		a=5;
		System.out.println(a++);
		//먼저 출력 후 a 증가(선언시만 5, 실제 값은 +1을 갖고있음)
		System.out.println(++a);//앞선 증가 a에 먼저 증가 후 출력
		//(me)앞 선언에서 후치++이 증감되어 뒤 선언시 1+6으로 계산(순서차이)
		
		a=b=m=n=5;
		a*=b-- -++n*3; //5-6*3 => 5*-13
		//++(:6)-> ++*3 (우선순위 차이/ 보통 이렇게 식 사용 안함,복잡..)
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);
		

	}

}
