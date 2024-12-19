package day1219;

import java.util.Calendar;

public class Student {
	//메인 선택 안함
	private String stuName; 
	private String stuAddress;
	private String stuBlood;
	private int stuBirthYear;
	private int stuScore;
	//private는 다른 곳에서 호출 불가 그래서 setter,getter를 사용함
	//위에 두개만 generate 생성
	public String getStuName() {
		//구역 안에 같은 이름 없어 this 사용 x
		return stuName;
	}
	public void setStuName(String stuName) { 
		//멤버변수 stuName과 파라미터 stuName이 같음
		//구역 안에 같은 이름이 있어 this 사용 o
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	
		//stuBlood에 대한 setter & getter
		public String getStuBlood() {
			return stuBlood;
		}
		
		public void setStuBlood(String stuBlood) { 
			this.stuBlood = stuBlood;
		}
		
		//stuBirthYear에 대한 setter & getter
		public int getStuBirthYear() {
			return stuBirthYear;
		}
		
		public void setStuBirthYear(int stuBirthYear) {
			this.stuBirthYear = stuBirthYear;
		}
		
		//stuScore에 대한 setter & getter
		public int getstuScore() {
			return stuScore; //반환을 위함
		}
		
		public void setStuScore(int stuScore) {
			this.stuScore = stuScore; //파라미터로 받은 stuScore값을 저장
		}
		
		//한꺼번에 변경하는 경우(setter사용하여)
		public void changeStudent(String stuName, String stuAddress, String stuBlood)
		{
			this.setStuName(stuName);
			this.setStuAddress(stuAddress);
			this.setStuBlood(stuBlood);
		}
		
		//stuScore에 대한 절대평가(A~F) 반환하는 메서드
		public char getScoreGrade() //멤버변수 있어서 괄호 안에 작성 안함
		{
			char grade = switch(stuScore/10)
					{
			                    case 10,9->'A'; //케이스10은 A를 반환한다
			                    case 8->'B';
			                    case 7->'C';
			                    case 6->'D';
			                    default->'F';
			
					};
					return grade;
		}
		//stuBirthYear 로 나이를 구해서 반환 (현재년도를 따로 구해서 계산해야함)
		//데이트클래스 or 캘린더 사용하여 계산
		public int getAge()
		{
			//현재 년도
			//Calendar를 이용해서 현재년도 구하기
			Calendar cal = Calendar.getInstance(); //protected는 new를 생성할 수 없음 반환 불가, 인스턴스를 생성해야 나머지 호출 가능
			int curYear = cal.get(Calendar.YEAR); //calendar은 static상수?! (확인해보기)
			
			return curYear - stuBirthYear;
		}

}
