package day1212;

public class Ex5Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//조건(삼항)연산자
		//조건식1? 참일때 값 : 거짓일때 값
		//조건이 여러개인경우
		//조건식 1?이 참일때 값:조건식2?참일때 값:조건식3?참이때 값:거짓일때값
		//마지막은 거짓일때 값이 들어가야해
		int x,y,max;
		x=5;
		y=3;
		
		max=x>y?x:y;
		System.out.println("max="+max);
		
		int z=20;
		max=x>y&&x>z?x:y>x&&y>z?y:z;
		System.out.println("max="+max);
		
		int score=89;
		char grade;
		grade=score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
		
		
		//수식을 구현: 90이상이면 'A', 80이상이면 'B', 70이상이면 'C',60이상이면'D',나머지는'F'
		
		System.out.println(score+"점은 "+grade+"학점입니다");
		
		//점수가 90이상이면 Good 나머지 Try 출력
		System.out.println(score+"점수는 "+(score>=90?"Good!!":"Try!!")); //장점:메소드안에도 연산자를 넣을 수 있다
		
	}

}
