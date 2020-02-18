package lamda;

interface PrintString {
	void showString(String str);
}

public class TestLamda {

	public static void main(String[] args) {
		// 함수의 구현부가 변수에 바로 대입
		PrintString lamdaStr = s -> System.out.println(s);
		lamdaStr.showString("Test");
		
		showMyString(lamdaStr);
		
		PrintString returnStr = returnString();		// 구현부에 대해서 returnStr 변수로 반환받은것
		returnStr.showString("Test3");
		// -> 함수의 구현부가 변수처럼 반환되서 변수값이 대입이 되고 메서드호출. (구현부자체가 반환이되는것)
	}
	
	// 변수가 매개변수로 대입되어서 구현부가 실행
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}

}
