package day1217;

public class Ex5ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 기본문제 '최대값, 최소값 구하기'
		
		int []data = {2,30,-96,48,61,84,21,68,-9,5}; //세미콜론 빼먹지마!
		int max=data[0];//일단은 첫데이터를 최대값으로 지정한다
		int min=data[0]; //일단은 첫데이터를 지정
		//1번지부터 끝까지 비교해서 max보다 더 큰값이 나오면 그 값을 max에 저장
//		for(int i=1;i<data.length;i++) {
//			
//			if(max<data[i]) {
//	
//				max=data[i];
//			}
//			 if(min>data[i]) {
//			    	min=data[i];
//		    }
//		    	
//	    }
//		System.out.println("max = "+max);
//		System.out.println("min = "+min);
//		
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i]) {
				max=data[i];
			}
			if(min>data[i]) {
				min=data[i];
			}
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}

}
