package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		
		CompleteCalc calc = new CompleteCalc();
		Calc calc2 = new CompleteCalc();			// 선언가능(상황마다 다르지만, 인터페이스타입으로 많이 구현함)
		// -> 인터페이스를 구현한 클래스는 인터페이스 타입으로 변수를 선언하여 인스턴스를 생성할 수 있음,
		// -> 인터페이스는 구현 코드가 없기 때문에 타입 상속이라고도 함
		Calculator calc3 = new CompleteCalc();		// 선언가능
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		calc.showInfo();
//		calc2.showInfo();		// 변수타입 때문에 오류남 -> showInfo는 CompleteCalc에만 제공해서
	}

}
