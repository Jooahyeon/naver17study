package day1216;

import java.net.MulticastSocket;

public class Ex10Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * repeat 이용해서 줄?
		 * 2단 3단 --- 9단 (for문)
		 * 2x1=2 3x1=3 --- 9x1=9 (다중for문)
		 */
		
		//다중 for문을 활용한 달력만들기 + 배열~
		
//		int su=1;
//		
//		for(int i=1;i<=9;i++) 
//		{
//			System.out.print("["+i+"단]");
//
//		    System.out.println("=".repeat(50));
//		    System.out.println();
//		 
//			for(int j=1;j<=9;j++) 
//			{ 
//				su=i*j;
//				System.out.println(i+"x"+j+"="+su);
//				System.out.println();
//			}
//		}
		for(int dan=2;dan<=9;dan++)
			System.out.print("["+dan+"단]\t");
		System.out.println();
		System.out.println("=".repeat(65));
		
		for(int i=1;i<=9;i++)
		{
			for(int dan=2;dan<=9;dan++)
			{
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
		}	
	}
  


