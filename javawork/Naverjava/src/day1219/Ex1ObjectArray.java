package day1219;

import java.util.Scanner;

public class Ex1ObjectArray {
	Student []stuArray = new Student[3]; //반드시 사전 생성 하고 데이터를 읽어서 출력해야함(초기값은 null로 들어감
	//스튜던트라는 멤버변수가 어디에 선언 되어있느냐에 따라 호출방법이 달라짐
	
	public void inputDate()
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("inputData");
		for(int i=0;i<stuArray.length;i++)
		{
			//생성
			stuArray[i] = new Student();
			
			System.out.println("학생이름?");
			String name = sc.nextLine();
			System.out.println("혈액형은?");
			String blood = sc.nextLine();
			System.out.println("태어난 년도는?");
			int birthyear = Integer.parseInt(sc.nextLine());
			System.out.println("점수는?");
			int score = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			//s에 데이터를 넣기
			stuArray[i].setStuName(name);
			stuArray[i].setStuBlood(blood);
			stuArray[i].setStuBirthYear(birthyear);
			stuArray[i].setStuScore(score);
		}
	}
	
	public static void showTitle() 
	//멤버변수 없어도 괜찮으니 static으로 사용
	//이거 제외하고 모두 인스턴스 
	{
//		System.out.println("showTitle");
		System.out.println("이름\t혈액형\t나이\t점수\t학점");
		System.out.println("=".repeat(60));
	}
	
	public void writeDataArray()
	{
//		System.out.println("write");
		
		for(Student s:stuArray)
		{
			System.out.println(s.getStuName()+"\t"+s.getStuBlood().toUpperCase()+"형"+"\t"+s.getAge()+"\t"+s.getstuScore()+"\t"+s.getScoreGrade());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//student 클래스에 있는 데이터를 넣어서 반복문으로 출력
		//static을 뺀 나머지는 new를 이용해서 호출해야해
		
		Ex1ObjectArray ex1 = new Ex1ObjectArray();
		//데이타입력
		ex1.inputDate();
		//제목출력
		showTitle();
		//데이타출력
		ex1.writeDataArray();

	}

}
