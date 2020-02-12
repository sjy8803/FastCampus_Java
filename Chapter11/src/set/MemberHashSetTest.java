package set;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2");		
		// Member 클래스에 아이디가 같으면 같은 멤버라는것이 논리적으로 구현되어 있지않음 -> 그래서 Member클래스에서 equals, hashCode를 재정의
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(100);
		manager.showAllMember();
	}

}
