package day1211;

public class Ex6_1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello";
		String str2=new String("Happy");
		// 두가지 방법 모두 사용 가능
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("\t"+str1);
		System.out.println("\t\t"+str2);
		
		//printf에서 문자열의 변환기호는 %s 
		
		System.out.printf("%s\n",str1);
		System.out.printf("%30s\n",str2);
		System.out.printf("%50s\n",str1);
		System.out.printf("**%-20s**\n",str1);
		System.out.printf("%s%s\n",str1,str2);
		
		
		
		
		
	}

}
