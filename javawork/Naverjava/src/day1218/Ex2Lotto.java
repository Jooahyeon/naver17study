package day1218;

import java.util.Random;
import java.util.Scanner;

public class Ex2Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money;
		int [] lotto = new int[6];
		Random r = new Random();

		//금액 입력
		System.out.println("금액을 입력해주세요");
		money = sc.nextInt();


		//1000원 미만이면 종료
		if(money<1000) {
			System.out.println("** 금액이 부족합니다 **");
			return;
		}
		//금액만큼 로또 숫자 발생 후 출력(오름차순)
		for(int n=1;n<money/1000+1;n++) { //모든게 해당 for문안에서 이루어짐!
			System.out.printf("%3d회 : ", n);

			//lotto 배열에 1~45사이의 난수발생 (중복체크로직)
			//lotto는 1회에 중복되는 수가 없으면 됨, 전체가 아님!
			for(int i=0;i<lotto.length;i++) {
				lotto[i]=r.nextInt(45)+1; //0이 나오면 안되서 +1인가?

				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
						i--; //중복되는 경우 i의 순서에서 빼고 다시 돌려!
						break;
					}
				}
			}
			//오름차순 정렬 후 (출력해여함)
			//i>j일 경우 오름차순
			for(int i=0;i<lotto.length-1;i++) {
				for(int j=i+1;j<lotto.length;j++) {
					if(lotto[i]>lotto[j]) {
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			//출력 여기서! (큰 for문 안에 있음)
			for(int i=0;i<lotto.length;i++) {
				System.out.printf("%4d",lotto[i]);
			}
			System.out.println();
		}

	}

}
