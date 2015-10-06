package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @file_name : NumberBingo.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 10. 5.
 * @story     : 숫자 맞추기 게임
 */
public class NumberBingo {
	/**
	 * 1부터 10까지 랜덤숫자를 컴퓨터가 생성하면
	 * 3회안에 숫자를 맞추는데
	 * 플레이어가 입력한 숫자가 답보다 큰지 작은지를 알려줌
	 */
	public static void main(String[] args) {
		int com =0, player=0, count=0;
		com=0; //랜덤수 발생
		Scanner scanner = new Scanner(System.in);
		com =  (int) (Math.random()*10+1);
		while (true) {
			
			try {
				System.out.println("1부터 10까지 숫자를 입력하세요");
				player = scanner.nextInt();
				count ++;
				if (player==com) {
					System.out.println("정답입니다.");
					return;
					
				} else 
				{if (count==3) {
				System.out.println("게임의 총 회수는 3회입니다.");
				System.out.println("정답은 "+com);
				return;
											}
				else {
					System.out.println(player>com ? player+"보다 작습니다": player+"보다 큽니다.");
				}

				}
				
			} catch (InputMismatchException e) {
				System.out.println("1부터 10사이 숫자만 입력하세요");
				count--; //범위 밖의 숫자를 입력했을 때에는 카운트에서 제외해준다.
			
		}
	}

}
}