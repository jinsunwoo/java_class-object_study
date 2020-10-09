/*
 * 클래스: 객체의 설계도
 * 클래스 ==실체화==> 오브젝트화(인스턴스화) 한다. 
 * 필드 + 메서드 = 클래스 멤버
 */

// 클래스 정의
class Npc {
	// 필드 데이터
	String name;
	int hp;
	// 메서드 동작
	void say() {
		System.out.println("안녕하세요.");
	}
}

public class MyNpc {

	public static void main(String[] args) {
		Npc saram1 = new Npc();
		saram1.name = "경비";
		saram1.hp =  100;
	    System.out.println(saram1.name + " : " + saram1.hp);
	    saram1.say();
	}
}
