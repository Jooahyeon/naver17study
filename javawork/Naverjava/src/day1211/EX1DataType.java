package day1211;

public class EX1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=127;
		byte b=(byte)128; //(byte): 강제 형변환 -cast연산자
		byte c=(byte)200;
		byte d=(byte)161;
		System.out.println("a="+a);// 범위안에 들어가서 127
		System.out.println("b="+b);// 틀린값,범위를 벗어나므로-128
		System.out.println("c="+c);// 2의 보수로 계산하여 나온 값-56
		System.out.println("d="+d);// 2의 보수로 게산하여 나온 값-95
	}
}
