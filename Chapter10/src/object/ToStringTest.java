package object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}	// 인터페이스를 명시를 해야됨 Cloneable

	@Override
	protected void finalize() throws Throwable {		// 직접 불러오지 않고 인스턴스가 흰 메모리에서 해지될때, 가비지콜렉터에 의해서 매서드를 수행되는 코드 -> 리소스해제, 안닫힌소켓을 종료 등
		super.finalize();
	}
	
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("토지", "박경리");
		System.out.println(book);		// '클래스풀네임@해쉬코드(=메모리주소)'
		
		String str = new String("토지");
		System.out.println(str);
		System.out.println(str.toString());
		
		//
		Book book2 = (Book)book.clone();
		System.out.println(book2);
	}

}
