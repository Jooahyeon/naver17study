package day1217;

public class Ex13NumberSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = {4,1,5,3,2};
		//숫자정렬
		//이문제 말고 문자열 비교할거면 compareTo
		//selection
		for(int i=0;i<data.length-1;i++)
		{
			for(int j=i+1;j<data.length;j++)// 왜 i+1이지?
			{
				//	if(data[i]>data[j]) //오름차순 정렬
				if(data[i]<data[j]) //기준이 더 크게하면 내림차순
				{
					int temp = data[i]; //if문 내에 사용할 지역변수 선언
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}

		for(int i=0;i<data.length;i++)
		{
			System.out.println(i+"번째:"+data[i]);
		}

	}

}
