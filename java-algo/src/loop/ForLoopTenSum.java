package loop;

import java.util.Scanner;

/**
 * @file_name : ForLoopTenSum.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1 - 10 의 요소의 합 구하기
 */

public class ForLoopTenSum {
	/**
	 * To. 개발자님
	 * 교수님이 1부터 원하는 숫자까지 합 구하는 프로그램이 필요하답니다.
	 * 등차수열 1 - 10 요소의 합 
	 * 힌트 : 3+ 1 = 4
	 * 3 +=1;
	 */
	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 int input =0, sum=0;
		 System.out.println(" 원하는 숫자를 입력하세요");
		 input = scanner.nextInt();
		 for (int i = 1; i <= input; i++) {
			sum += i;  //foo = foo +i 
			// 기존 변수에 값을 누적시키는 연산자 +=, 감소시키는 연산자 -=
			/**
			 * foo = foo + 1; 
			 * foo = foo + 2;
			 * foo = foo + 3;===>10바퀴를 돈다
			 * foo = foo 10;
			 */
			
			
			}
		 System.out.println("1부터" +input+"까지의 합 :"+sum);
		}
			
		}


