package day1217;

public class Ex3ArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int형 배열 활용 방법?
		int []arr1;
		arr1 = new int[5]; //할당과 동시에 초기값 대입
		arr1[0] = 23;
		arr1[3] = 50;
		for(int i=0; i<arr1.length;i++)
			System.out.println("arr1["+i+"]="+arr1[i]);
		// 값이 따로 없는 애들은 초기값이 0으로 존재
		System.out.println("=".repeat(30));
		
		int []arr2 = new int[5];
		arr2 = new int[] {23,45,56,11,29};
		for(int i=0;i<arr2.length;i++)
			System.out.println("arr2["+i+"]="+arr2[i]);
		System.out.println("=".repeat(30));
		
		int []arr3 = {90,100,89,54,65};
		for(int i=0; i<arr3.length;i++)
			System.out.println("arr3["+i+"]="+arr3[i]);

	}

}
