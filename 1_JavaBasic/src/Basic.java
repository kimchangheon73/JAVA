/*
 * 소스 파일 : Basic.java
 */
import java.util.Scanner;

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
	
	// 2.4 타입 변환
	public static void transtype() {
		long m = 25; // int형 25가 long 타입으로 자동변환 
		double d = 3.14 * 10; // 실수 연산을 위해 10이 10.0으로 자동변환 
		
		// 자료형 강제변환 -> 강제변환을 자료손실을 초래
		int n = 300;
		byte b = (byte) n;
		System.out.println(n);
		System.out.println(b);
	}
	
	// 2.5 자바의 키 입력 
	public static void sysin() {
		/* Scanner Read type 
		 * String  var : Scanner.next();
		 * int     var : Scanner.nextInt();
		 * double  var : Scanner.nextDouble();
		 * boolean var : Scanner.nextBoolean();
		 */
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean aloneTF = scanner.nextBoolean();
		System.out.println("이름 :" + name);
		System.out.println("도시 :" + city);
		System.out.println("연령 :" + age);
		System.out.println("무게 :" + weight);
		System.out.println("독거 :" + aloneTF);
	}
	
	// 2.6 자바의 연산자
	public static void calc() {	
		System.out.print("정수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
	
		int time = scanner.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println("Total sec : " + time);
		System.out.println("second : " + second);
		System.out.println("minute : " + minute);
		System.out.println("hour : " + hour);
	}
	
	// 2.7 자바의 조건연산 - 삼항연산자
	public static void ifcalc() {
		// opr1? opr2:opr3
		// opr1 == true -> opr2, false -> opr3
		int big = (3>5)?3:5;
		System.out.println(big);
	}
	
	// 2.8 자바의 if
	public static void ifcmd() {
		System.out.print("나이를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt(); 
		
		if((age>=20) && (age<30)) { // age가 20~29 사이인지 검사
			System.out.print("20대입니다. ");
			System.out.println("20대라서 행복합니다!");
			}
		else {
			System.out.println("20대가 아닙니다.");
		}
			
		scanner.close();
	}
	// 2.9 자바의 다중 if
	public static void multi_if() {
		System.out.print("점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int grade = scanner.nextInt();
		if (grade<60) {
			System.out.println("낙제");
		}else if (grade < 80) {
			System.out.println("보통");
		}else {
			System.out.println("우수");
		}	
	}
	
	// 2.10 switch-case
	public static void switch_case() {
		System.out.print("학점을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String result = scanner.next();
		
		switch(result) {
		case "A":
			
			System.out.println("우수");
			break;
		case "B":
			System.out.println("보통");
			break;
		case "C":
			System.out.println("미흡");
			break;
		default:
			System.out.println("낙제");
		}
	}
	
	
	
	
	// main()메서드 -> 자바프로그램을 실행하는 
	public static void main(String[] args) {
		// double circle = circle_pi(7);
		// System.out.println(circle);

		// transtype();		
		// sysin();
		// calc();
		// ifcalc();
		// ifcmd();
		// multi_if();
		switch_case();
	}
}


