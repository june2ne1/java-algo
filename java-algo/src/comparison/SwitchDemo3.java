package comparison;

import java.util.Scanner;

/**
  * @file_name : SwitchDemo.java
  * @author    : june2ne1@naver.com
  * @date      : 2015. 9. 17.
  * @story     : 스위치 문법
  */
public class SwitchDemo3 {
	public static void main(String[] args) {
		/**
		 * 월을 입력하면 해당 월이 몇일까지인지
		 * 알려주는 프로그램을 작성하시오.
		 * 단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
		 * 출력문장 : "??월은  **일 까지 입니다."
		 */
		//int month = Integer.parseInt(args[0]);
		// 리터럴 : 문자열리터럴
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		 String res= null; // 지역변수는 반드시 초기화를 해주어야 한다.
		 int month = scanner.nextInt();
		 //필터링
		 //유효성 체크 validation
		 if (month>12){
			 System.out.println("존재하지않습니다");
		 }
		 else{
		 switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		        res = "31"; break;
		case 4:case 6:case 9:case 11:
			res = "30일"; break;
		case 2: 
			res = "29일"; break;
			default :
				System.out.println("에러발생");
			
		}
		 System.out.println(month+"월은"+res+"일까지입니다.");
		 
		 
		}
	}
}
