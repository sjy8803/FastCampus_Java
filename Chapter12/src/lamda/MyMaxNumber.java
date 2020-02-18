package lamda;

@FunctionalInterface
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
	// -> 함수형인터페이스는 익명함수로 처리하기 떄문에 메서드는 하나만 사용가능
}
