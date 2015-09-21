package loop;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : ForLoopTenSum.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열입력한 값과 값사이의 요소의 홀수합, 짝수합 따로 구하기
 */

public class ForLoopSum3 {
	/**
	 * 입력받은 두개의 수 엄위 값 중에서
	 * 짝수의 합, 홀수의 합을 따로 출력하세요
	 */
	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 int input =0, input2=0, sum=0, small=0, big=0 ,oddsum=0,evensum=0,oddsum2=0, evensum2=0;
		 input = scanner.nextInt();
		 System.out.println(" 원하는 숫자를 입력하세요");
		 input2 = scanner.nextInt();
		 //숫자 사이의 서열 정리
		 if (input < input2) {
				small = input;
				big = input2;
			} else {
				small = input2;
				big = input;
				} 
		 
		 for (int i = small; i <= big; i++) {// 이 문제에서 limit 값까지의 합이니까
			sum += i;
			if (i %2 ==0) {
				evensum += i;
				
			} else {
				oddsum += i;

			}
	}
		 System.out.println(small+"부터"+big+"까지 짝수의 합 :"+evensum);
		 System.out.println(small+"부터"+big+"까지의 홀수의 합 :"+oddsum);
		 if (small % 2 ==0) {
			for (int j = small; j < big; j+=2) {
				evensum2 += j;
			}
			for (int j = small +1; j <= big; j+=2){
				oddsum2 += j;
				
			}
		 }else{
			 for (int j = small; j <= big; j+=2) {
				 oddsum2 += j;
				
			}
			 for (int j = small+1; j <= big; j+=2) {
				
			}
			 System.out.println(small+"부터"+big+"까지 짝수의 합 :"+evensum);
			 System.out.println(small+"부터"+big+"까지의 홀수의 합 :"+oddsum);
		 }
	}
}

	
			
	

		
	
	
