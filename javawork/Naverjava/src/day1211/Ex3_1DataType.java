package day1211;

public class Ex3_1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실수형 변환기호-> '%f' 활용
		
		float f1=3.6f;
		double f2=5.2;
		
		System.out.println("f1 = "+f1);
		System.out.println("f2 = "+f2);
		
		//실수형 변환기호 활용
		float f3=2.123456789f;
		double f4=2.123456789;
		
		System.out.println("f3 = "+f3);
		System.out.println("f4 = "+f4);
		
		System.out.printf("f3=%f\nf4=%f\n",f3,f4);
		System.out.printf("f3=%5.1f\nf4=%5.2f\n",f3,f4);
		

	}

}
