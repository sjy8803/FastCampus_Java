package innerclass;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {
			
			@Override
			public void run() {
				
//				num += 10;		
				// 지역내부클래스 안에서 사용하는 지역변수에 대해서(=익명내부클래스에서) 값을 변경할수 없어서 오류발생(라이프타임이 길기때문에 상수화시키기 때문)
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		};

	}
	
	Runnable runner = new Runnable() {		// 익명 이너클래스는 인터페이스나 추상클래스에 대한 생성을 바로 가능(클래스 생성 필요없음)
		// 즉 단하나의 하나의 인터페이스나 추상클래스인 경우는 클래스이름 없이 바로 new 키워드를 이용해서 생성할수 있음(그 인터페이스,추상클래스타입으로)
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnnoymousInnerClassTest {

	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.runner.run();		// 익명 이너클래스는 바로 인터페이스 추상클래스를 생성할수 있음
		
		Runnable runnable = outer.getRunnable(50);
		runnable.run();
	}

}
