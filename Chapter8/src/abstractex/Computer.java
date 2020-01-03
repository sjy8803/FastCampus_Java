package abstractex;

public abstract class Computer {

//	public void display() {		// 추상메서드 X
//	}
//	public void typing();		// 추상메서드 O -> 바디가 없기때문에
	public abstract void display();		// abstact 추상메서드가 있으면 클래스에서 오류 -> 클래스가 abstract를 가지고있거나 클래스앞에 abstract붙여야함
	public abstract void typing();
	// -> 추상메서드는 하위클래스에서(상속) 구현함. 단독으로 쓰려고 만든클래스가 아님.
	// 추상클래스는 주로 상속의 상위클래스로 사용
	// 추상메서드는 하위클래스가 구현해야 하는 메서드
	// 구현된메서드는 하위클래스가 공통으로 사용하는 기능의 메서드 -> 하위클래스에 따라 재정의 할 수 있음
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
}
