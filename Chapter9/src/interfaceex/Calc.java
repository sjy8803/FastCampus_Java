package interfaceex;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// default 메서드
	default void description() {
		System.out.println("점수 계산기를 구현합니다.");
//		myMethod();
	}
	
	// static 메서드
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr ) {
			total += i;
		}
//		myStaticMethod();
		return total;
	}
	
	// private 메서드(일반메서드, static메서드로 나눠짐) - Java9 이후부터 가능
		// 일반
//	private void myMethod() {
//		System.out.println("private method");
//	}
//		// static
//	private static void myStaticMethod() {
//		System.out.println("private static method");
//	}
	
}
