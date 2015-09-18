package comparison;

import java.util.Scanner;

/**
 * @file_name : IfTest2.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 17.
 * @story     : 1등 구하기
 */
public class IfTest2 {
	/**
	 *  To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 3명의 이름과 각  평균을 입력하면 1등을 알려주는 기능을 추가해 달랍니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 1등 : 김유신  
	 * 단) 학생은 총 3명입니다. 그리고 평균 점수는 0이상 100이하입니다.
	 * 교수가 실수로 120점이라든지 범위 밖 점수를 입력하면
	 * "다시 입력하세요" 라고 알려주시길 바랍니다.
	 */
		 public static void main(String[] args) {
		
			 
			 Scanner scanner = new Scanner(System.in);
			System.out.println("이름1 : ");
			 String name1 = scanner.next();
			 System.out.println("평균1 : ");
			 int avg1 = scanner.nextInt();
			 System.out.println("이름2 : ");
			 String name2 = scanner.next();
			 System.out.println("평균2 : ");
			 int avg2 = scanner.nextInt();
			 System.out.println("이름3 : ");
			 String name3 = scanner.next();
			 System.out.println("평균3 : ");
			 int avg3 = scanner.nextInt();
			 
			 if (avg1 < 0 || avg1 > 100 || avg2 < 0 || avg2 > 100 ||avg3 < 0 || avg3 > 100) {
				 System.out.println("다시 입력하세요");
		
			}
			
			 else if (avg1 > avg2 && avg1 > avg3 ) {
				 System.out.println("1등 :"+name1);
				
			} else if(avg2 > avg1 && avg2 > avg3) {
				System.out.println("1등 :"+name2);
			}else {
				System.out.println("1등 :"+name3);
				
			}
			 
			
		}
		 
	}

