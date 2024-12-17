package day1217;

public class Ex6ArrayRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 등수구하기-동점은 동순위 부여
		int []score = {56,89,100,89,67,87,78};
		int []rank = new int[score.length]; //new int[]내에 '5' 대신 score.length를 사용시 점수가 변경되어도 구할 수 있음 (자동으로 입력한 개수만큼 할당됨)
		for (int i=0;i<score.length;i++) //등수가 부여되는 사람 
		{
			rank[i]=1;
			for(int j=0;j<score.length;j++) // 등수 비교당하는 사람
			{
				if(score[i]<score[j])
					rank[i]++;	
			}
		}
	     System.out.println("번호\t점수\t등수");
	     System.out.println("=".repeat(30));
	
        	 for(int i=0;i<score.length;i++)
	          System.out.println(i+1+"\t"+score[i]+"\t"+rank[i]);
	}

}