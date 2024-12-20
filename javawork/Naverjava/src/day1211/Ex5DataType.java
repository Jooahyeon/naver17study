package day1211;

public class Ex5DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서 char 타입은 2바이트이다(한글 한글자도 저장 가능)
		char ch1='A'; //'로만 출력 가능
		char ch2='가';
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		
		//printf로 출력시 변환기호 1글자: %c, 문자열:%s
		System.out.printf("ch1=%c\tch2=%c\n",ch1,ch2);
		System.out.printf("ch1=%d\tch2=%d\n",(int)ch1,(int)ch2); //형변환, ascii code로 변환되서 출력
		
		
		//int와 char은 형변환이 서로 가능
		//Q.
		int a=65;
		System.out.println(a);
		System.out.println(a+32);
		System.out.println((char)a); //A
		System.out.println((char)(a+32));//a
		
		//printf를 이용해서 출력해보자(변환기호만 잘 쓰면 해당되는 문자로 출력)
		System.out.printf("%c,%c,%c,%c\n",a,a+2,a+33,a+40);
		//ascii code 표를 찾아서 Hello 를 출력해보세요
		System.out.printf("%c,%c,%c,%c,%c\n",65+7,65+4,65+11,65+11,65+14);
		System.out.printf("%c,%c,%c,%c,%c\n",72,101,108,108,111);
	}

}
