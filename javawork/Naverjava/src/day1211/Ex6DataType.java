package day1211;

public class Ex6DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String은 기본형 no, 객체타입이다.
		 String str1="Hello";
		 String str2=new String("Happy"); //두가지 방법 다 사용 가능
		 
		 System.out.println(str1);
		 System.out.println(str2);
		 System.out.println("\t"+str1);
		 System.out.println("\t\t"+str2);
		 
		 //printf에서 문자열의 변환기호는 %s/ (-)는 왼쪽정렬
		 System.out.printf("%s\n",str1);
		 System.out.printf("%30s\n",str1); //30칸 오른쪽 정렬
		 System.out.printf("%40s\n",str1); 
		 System.out.printf("**%-30s**\n",str1); //30칸 (-)왼쪽정렬
		 
		 //문자열에서 +(더하기)연산자는 나열을 의미한다.
		 System.out.println(str1+str2);

	}

}
