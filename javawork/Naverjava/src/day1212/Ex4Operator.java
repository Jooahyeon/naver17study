package day1212;

public class Ex4Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//관계연산자(>,<,>=,<=,==,!=)(!=not), 논리연산자(&&,||,!)
		//=>결과값은 무조건 boolean형(true or false)
		int kor=89, eng=100, mat=89;
		boolean f=false;
		//기본형은 소문자
		
		System.out.println(kor>eng);//f
		System.out.println(kor<eng);//t
		System.out.println(kor==mat);//t
		System.out.println(kor!=mat);//f
		System.out.println(kor>eng && ++eng>mat);//f
		//false && true : 
		//1번째조건이 false일 경우 두번째 조건은 비교 no
		System.out.println(eng); //100
		System.out.println(kor>eng || ++eng>mat);//t
		//false || true : 
		//||는 첫번째 조건이 true인 경우 비교 no(뒷수식 처리x)
		System.out.println(eng); //1증가되었음
		System.out.println(!(kor>eng));//t
		System.out.println(!f); //반대가 된다!
	}

}
