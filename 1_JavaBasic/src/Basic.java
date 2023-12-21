/*
 * 소스 파일 : Basic.java
 */
public class Basic {
	// 2.1 매서드 
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 2.2 데이터 타입
	void datatype() {
		// default type
			// boolean | char | byte | short | int | long | float | double
		// Reference type
			// Class | Interface | Array
		// String Class
	}
	
	// 2.3 예제 : 원의 면적을 계산하여 출력하는 프로그램
	public static double circle_pi(int r) {
		final double PI = 3.14;
		double result = PI * (r*r);
		return result;
	}
	
	// main()메서드 -> 자바프로그램을 실행하는 메서드
	public static void main(String[] args) {
		double circle = circle_pi(7);
		System.out.println(circle);
		
	}
}


