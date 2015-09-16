package operator;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * @file_name : UnaryTest.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 단항연산자 예제
 */
public class UnaryTest {
	public static void main(String[] args) {
		/**
		 * 문제 : 정수형 변수 X = 5, y = 10, z = 0 일때
		 */
		int x = 5, y = 10, z = 0;
		// z = x 후위 + x전위 + y후위 식을 연산자를 사용해서 완성하고
		// z의 결과값ㅇ르 출력하시오. 그리고 그 이유를 설명하시오.
		
		System.out.println(x++ );
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(y++);
		
		System.out.println("z= "+z);
		
		
		
		
	}

}
