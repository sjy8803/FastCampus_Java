package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("ÅÂ¹é»ê¸Æ1");
		bookQueue.enQueue("ÅÂ¹é»ê¸Æ2");
		bookQueue.enQueue("ÅÂ¹é»ê¸Æ3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}