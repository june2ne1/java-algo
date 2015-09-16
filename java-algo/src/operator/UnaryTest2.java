package operator;
/**
 * @file_name : UnaryTest2.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 16.
 * @story     : [cookbook-java5.0] p.91-2 단항연산자 예제
 */
public class UnaryTest2 {
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		System.out.println(++a);
		
		System.out.println(++a + b++);
		
		System.out.println((++a%3) + (a*++b));
		
	}
}