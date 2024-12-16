package day1216;

public class Ex4Forlable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loop: //레이블 명 임의 설정
			for(int i=1; i<=3; i++) 
			{
				for(int j=1; j<=4; j++)
				{
					if(j==2)
						continue Loop; // i++로 이동
					System.out.println("i="+i+",j="+j);
				}
		   }
	}

}
