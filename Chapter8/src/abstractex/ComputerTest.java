package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		Computer com = new DeskTop();
		com.display();
		com.turnOff();
		
		Computer myNoteBook = new MyNoteBook();
//		NoteBook myNoteBook2 = new MyNoteBook();	// 위에와 동일함(상위클래스를 내포하기때문)
		myNoteBook.display();
	}

}
