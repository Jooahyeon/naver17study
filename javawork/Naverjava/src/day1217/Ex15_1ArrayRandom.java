package day1217;

public class Ex15_1ArrayRandom {

	public static void main(String[] args) {

		/* (숙제 풀어본거->git보기)
		 * 배열에 1~50사이의 난수 20개를 구하여 넣고
		 * 오름차순으로 정렬해서 출력하시오
		 * 
		 */
		//배열에서 for문 '=' 부호 사용 조심

		int []numbers = new int [20];

		Loop:
			for(int i=0;i<numbers.length;i++)
			{
				numbers[i]=(int)(Math.random()*50)+1;
				//double형이라 앞에 (int)가 붙나?맞아

				//이전에 발생한 값이랑 같을 경우 다시 구하기
				//(중복처리로직추가)

				for(int j=0;j<i;) {
					if(numbers[i]==numbers[j])
					{
						i--;
						//berak; 방법1
						continue Loop; //i++로 직접 이동
					}
				}
			}

		//		while(true)
		//		{ 
		//			for(int i=0;i<numbers.length-1;i++)
		//			{
		//				for(int j=i-1;j<numbers.length;j++)
		//				{ 
		//					if(numbers[i]-numbers[i]==0)
		//						break;
		//
		//					else if (numbers[i]<numbers[j])
		//					{
		//						int temp = numbers[i];
		//						numbers[i] = numbers[j];
		//						numbers[j] = temp;
		//					}
		//				}
		//			}

		for(int i=0;i<numbers.length;i++)
		{
			System.out.println((i+1)+"번째 수:"+numbers[i]);
		}
	}

}

