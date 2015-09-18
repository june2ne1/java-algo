package comparison;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @file_name : IfTest3.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 18.
 * @story     :  if - else  예제
 */
public class IfTest3 {
	/**
	 *  To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수가 주민번호를 입력하면 해당 학생이 남자인지, 여자인지, 외국인인지 
	 * 자동으로 출력해 주는 프로그램을 만들어 달랍니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 홍길동 : 800101-1234567 : 남  
	 * 입력값은 이름과 주민번호이고 남은 자동으로 출력되는 값입니다.
	 * 현행법상 1, 3 으로 시작되면 남자, 2, 4로 시작되면 여자, 5,6이면 외국인
	 * 교수가 실수로 0, 7, 8 ,9, 로 시작되는 주민번호를 입력하면
	 * "다시 입력하세요" 라고 알려주시길 바랍니다.
	 */
	public static void main(String[] args) {
		/**
		 * String ssn = scanner.next();
		 * char ch = ssn.charAt();
		 * ch == '1' avg == 80
		 * char ch = '';
		 * if(ch == '1')
		 * int avg = 0;
		 * if(avg == 88)
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name1 = scanner.next();
		System.out.println("주민번호를 입력하세요");
		String ssn = scanner.next(); // scanner을 통해 데이터를 입력받고, 입력받은 데이터를 ssn이라는 변수에 저장. 타입은 문자열.
		
		char ch = ssn.charAt(7); //ssn문자열에 7번째의 문자를 골라내서 ch라는 변수에 대입. 타입은 문자.
		if (ch =='0') {
			
		}
		
	
		

	}

	
}

