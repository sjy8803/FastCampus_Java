package treeset;

import java.util.Comparator;

//public class Member implements Comparable<Member>{
public class Member implements Comparator<Member>{

	private int memberId;
	private String memberName;
	
	public Member() {
		
	}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberId == member.memberId);
		}
		return false;
	}
	
//	@Override
//	public int compareTo(Member member) {
//		// 매개변수와 객체자신(this)를 비교
////		return (this.memberId - member.memberId);	// 오름차순
////		return (this.memberId - member.memberId) * (-1);	// 내름차순
//		// memberName으로 정렬
//		return this.memberName.compareTo(member.getMemberName());
//	}
	
	@Override
	public int compare(Member thismember, Member megemember) {
		return (thismember.memberId - megemember.memberId);		// treeSet 생성자에다 디폴트constructor를 써줘야한다 
		// TreeSet 생성자에 Comparator가 구현된 객체를 매개변수로 전달
	}
	
	
	
}
