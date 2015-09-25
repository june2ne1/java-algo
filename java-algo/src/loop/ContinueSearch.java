package loop;

import java.util.Scanner;

/**
 * @file_name : ContinueSearch.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 25.
 * @story     : continue를 이용한 간단한 검색엔진 원리 이해
 */
public class ContinueSearch {
	/**
	 *  검색어 [동해]가 존재하는 지 여부 체크
	 */
	public static void main(String[] args) {
		String dest = "동해물백두산";
		boolean isExist = false;
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
		System.out.println("검색어를 입력하세요. 종료하려면 q를 입력하세요.");
		String search = scanner.next();
		if (search.equals("q")) { 
			return;
		} 
		isExist = false;
		max = dest.length() - search.length();//검색어를 뺀 회전수는 의미없다
		System.out.println(max);
		test:for (int i = 0; i <= max; i++) {
			int searchCount = search.length(); // 검색어 낱말의 갯수 예)6개
		    int deststartPoint = i; //검색을 마친 후 다음 검색대상 낱말의 위치
			int searchstartPoint = 0;
			while (searchCount-- !=0) {
				if (dest.charAt(deststartPoint++) !=search.charAt(searchstartPoint++)){
				continue test;
					
				}	
			}
			isExist = true;
			break test;	
		}
		System.out.println(isExist ? "검색어 ["+search+"]존재 :" : "존재하지 않음");
		
	}

}
}

/**
* 29: 문법 용어로 "라벨" 이라고 부르며, C언어 GOTO문에 태그같에 해당한다.
* 42 : 삼항연산자 (조건문) ? true : false ; => if-esle
*/