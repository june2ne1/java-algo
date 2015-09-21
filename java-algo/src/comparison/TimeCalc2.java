package comparison;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : TimeCalc2.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 21.
 * @story     :
 */
public class TimeCalc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력해 주세요");
	    int sec = scanner.nextInt();
	   
	    int min = sec/60;
	    int hour = min/60;
	    int remainder1 = sec%60;
	    int remainder2 = min%60;
	    
	    if (sec < 60) {
			System.out.println(sec + " 초");
		} else  {
			System.out.println(sec +" 초="+hour+"시간"+remainder2+"분"+remainder1+"초");
		}
		
	}
}

	    
	 


