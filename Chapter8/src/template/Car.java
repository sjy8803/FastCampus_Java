package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	public void washCar() {}	// -> 구현을 확장할수 있는 메서드
	
	final public void run() {		// 재정의할수없도록 하기위해서 final 키워드 사용
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
