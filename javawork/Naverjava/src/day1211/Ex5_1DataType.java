package day1211;

public class Ex5_1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='A';
		char ch2='가';
		
		System.out.println("ch1 = "+ch1);
		System.out.println("ch2 = "+ch2);
		
		//printf로 출력시 변환기호 1글자: %c, 문자열:%s
		
		System.out.printf("ch1 = %c\n",ch1);
		System.out.printf("ch2 = %c\n",ch2);
		System.out.printf("ch1=%c\tch2=%c\n",ch1,ch2);
		
		//형변환 int형으로 변환시 <ascii code> 변환되서 출력
		//정수변환 %d 실수변환 %f
		System.out.printf("ch1=%d\tch2=%d\n",(int)ch1,(int)ch2);
		
		//int와 char은 형변환이 서로 가능
		int a=65;
		System.out.println(a);
		System.out.println(a+32);
		
		//ascii code
		System.out.printf("%c,%c,%c,%c\n",a,a+20,a+3,a+5);
		System.out.printf("%c,%c,%c,%c,%c\n",72,101,108,108,111);

	

	}

}
