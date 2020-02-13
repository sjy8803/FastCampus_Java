package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{		// 인스턴스 내부클래스
		// innerClass
		int iNum = 100;
//		static int sINum = 200;		// 사용불가능
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{		// 외부클래스 생성 여부없이 사용가능
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
//			System.out.println(inNum);		// 클래스생성이후에 만들어진 변수이기 때문에 일반메서드는 가능하지만 static 메서드에서는 불가능 (static만가능)
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
			System.out.println();
		OutClass.InClass myInClass = outClass.new InClass();		// 우선 외부클래스 먼저 생성되고, 그 생성된 참조변수를 활용해야됨(대신 private하면 사용x)
		myInClass.inTest();
		
			System.out.println("static inner class");
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();		// 외부클래스 생성없이 바로 스태틱클래스 생성가능
		sInClass.inTest();
			System.out.println();
		// 스태틱클래스 내부에 스태틱메서드 사용하기
		OutClass.InStaticClass.sTest();
	}

}
