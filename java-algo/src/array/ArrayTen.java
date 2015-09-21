package array;

import java.util.Scanner;

/**
 * @file_name : ArrayTen.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : int 타입 배열 요소의 합
 */
public class ArrayTen {
	/**
	 * 1부터 10까지의 합 구하기 (옵션 : 배열)
	 */
	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5};
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int [] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			 
			
		}
		System.out.println("합계"+sum);
		}
		
		
}

