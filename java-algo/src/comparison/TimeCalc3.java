package comparison;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : TimeCalc2.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 21.
 * @story     :
 */
public class TimeCalc3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour=0,sec=0,time=0, min=0;
		System.out.println("초를 시간과 분으로 바꾸어주는 프로그램입니다.");
		System.out.println("초를 입력해 주세요");
	     time = scanner.nextInt();
	     hour = (time/60)/60; //시
	     sec = time%60;//남는초
	     min =(time /60)%60;
	    
	    System.out.println(time +" 초 = "+hour+"시간"+min+"분"+sec+"초");
		}
		
	}


	    
	 


