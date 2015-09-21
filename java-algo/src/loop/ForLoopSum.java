package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopTenSum.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1 - 10 의 요소의 합 구하기
 */

public class ForLoopSum {
	/**
	 * To. 개발자님
	 * 교수님이 원하는 수부터 부터 원하는 숫자까지 합 구하는 프로그램이 필요하답니다.
	 * 그런데, 교수님이 까다로와서 큰 수를 먼저 입력하든
	 * 나중하든 두 수 사이의 정수들의 합을 나오게 해달랍니다.
	 * [결과]
	 * 5 부터 137까지의 합은????입니다.
	 */
	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 int input =0, input2=0, sum=0, small=0, big=0;
		 System.out.println(" 원하는 숫자를 입력하세요");
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
		 for (int i = input; i <= input2; i++) {// 이 문제에서 limit 값까지의 합이니까
			sum += i;
}
		 System.out.println(input+"부터"+input2+"까지의 합 :"+sum);
		}
			
		}


