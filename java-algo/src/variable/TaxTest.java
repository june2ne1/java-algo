package variable;

import java.util.Scanner;

/**
 * @file_name : TaxTest.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 세금 출력 프로그램
 */
public class TaxTest {
	/**
	 * 클라이언트에서 프로그램 개발 요청 왔습니다.
	 * 이름과 연봉을 입력받아서
	 * 연봉 ***만원을 받으시는 홍길동님께서 납부할 세금은 ???만원입니다.
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정권이 바뀔 때 마다 변하니,
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요.
	 * 현 정권은 세율이 9.7프로라고 합니다.
	 */
	
	public static void main(String[] args) {
	    // 지역변수 초기화 : 변수 값의 그타입에 맞는 기본값을 할당하는 것
		// 단) 스캐너로 입력받을시 생략 가능 
 		final double TAX_RATE = 0.097;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력을 입력해주세요.");
		String name = scanner.next();
		System.out.println("연봉을 입력해 주세요.");
		int salary = scanner.nextInt();
		
		int tax = (int) (salary * TAX_RATE);
		System.out.println("연봉"+salary+" 만원을 받으시는"+name+" 님께서 납부할 세금은"+tax+" 만원입니다.");
	}
}

