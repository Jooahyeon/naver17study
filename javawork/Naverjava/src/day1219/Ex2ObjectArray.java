package day1219;

import java.util.Scanner;

public class Ex2ObjectArray {
	// 출력할 변수가 이미 있으니 멤버변수 필요 없음 -> static사용
	
	public static void dataInput(Student s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름은?");
		String name = sc.nextLine();
		System.out.println("학생주소는?");
		String addr = sc.nextLine();
		System.out.println("학생혈액형은?");
		String blood = sc.nextLine();
		
		s.changeStudent(name, addr, blood);
		System.out.println();
	}
	
	public static void showTitle()
	{
		System.out.println("이름\t혈액형\t주소");
		System.out.println("=".repeat(35));
	}
	
	public static void writeStudent(Student s)
	{
		System.out.println(s.getStuName()+"\t"+s.getStuBlood().toUpperCase()+"형\t"+s.getStuAddress());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int inwon;
		Student []stuArray;
		
		System.out.println("입력할 인원수는?");
		inwon = Integer.parseInt(sc.nextLine());
		//메모리할당
		stuArray = new Student[inwon];
		
		//데이터입력 -> main에 있는 데이터가 들어감(메소드->메소드에서 기본형을경우 데이터가 안넘어감)
		for(int i=0;i<stuArray.length;i++)
		{
			stuArray[i] = new Student(); //생성
			dataInput(stuArray[i]); 
			//객체타입은 주소가 전달이 된다(주소를 통해서 데이타가 들어온다)
		}
		
		//제목출력
		showTitle();
		//내용출력
		for(int i=0;i<stuArray.length;i++) //중괄호 없어도 사용 가눙하네? 
			writeStudent(stuArray[i]);

	}

}
