package day1219;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer(); //객체생성
		
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1: "+ result1); 
		
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2: " + result2);
		
		int[] values = {1, 2, 3, 4, 5};
		int result3 = myCom.sum(values);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result4: " + result4);

	}

}
