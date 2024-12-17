package day1217;

public class Ex15ArrayRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수->Math.
		int []numbers = new int [20];

		/*
		 * 배열에 1~50사이의 난수 20개를 구하여 넣고
		 * 오름차순으로 정렬해서 출력하시오
		 * 
		 */
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=(int)(Math.random()*50)+1;
		}

		//이전에 발생한 값이랑 같을 경우 다시구하기-중복처리로직추가 (오늘 숙제)

		
		//정렬
		for(int i=0;i<numbers.length-1;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]<numbers[j]) //i가 더 클때 오름차순-> 순서변경하니까
				{

					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				} 
			}

		}
		//출력-한줄에 5개씩만 출력
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(i+":"+numbers[i]);
		}
	}
}
