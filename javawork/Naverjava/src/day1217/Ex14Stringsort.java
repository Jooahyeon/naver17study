package day1217;

public class Ex14Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자정렬(아스키코드 -> 한글 순으로 나옴!)
		String []names = {"박남정","공효진","김미나","이진","손석구","Adams"
		};
		//이름의 오름차순으로 출력 (변수명.compareTo) T-> 0 F-> -1

		for(int i=0;i<names.length-1;i++)//기준값(마지막 값은 비교하지 않아도 괜찮으니 빼준다)
		{
			for(int j=i+1;j<names.length;j++)//비교되는 값(기준값+1로 해줘야 기준값을 제외하고 다음부터 비교를 하게 됨)
			{
				//names[i]가 names[j]보다 클 경우 양수값, 작을경우 음수값
				//양수일때 오름차수, 음수일때 내림차수
				if(names[i].compareTo(names[j])<0)
				{
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

		for(int i=0;i<names.length;i++)
			System.out.println(i+"번째: "+names[i]);
	}

}
