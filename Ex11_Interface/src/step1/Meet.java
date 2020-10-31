/*
 * 인터페이스란 상속 관계가 아닌 클래스에 (추상 클래스 처럼) 기능을 제공하는 구조.
 * 클래스와 비슷한 구조이지만 static 변수와 추상메서드 만이 멤버가 될 수 있다는 점이 다르다.
 * 인터페이스에서 int a = 2; -> 원래 public static final int a = 2;
 *            void say(); -> public abstract say();
 * 인터페이스는 몇 개라도 구현할 수 있다. ex: class X implements A, B, C { } (상속은 단일 상속만 가능하다.)  
 * 인터페이스도 클래스처럼 상속 할 수 있다. 
 * 예) step2 -> Meet.java 
 * interface A {
 *     void greeting();
 * }
 * 
 * interface B extends A {
 *     void goodbye();
 * }
 * */

package step1;

interface Greet {
	void greet();
}

interface Bye {
	void bye();
}

// Greet, Bye 두개의 인터페이스를 implements 받았기 때문에 abstract method greet(), bye(), 를 각각 override 해줘야 함.
// 상속과이 차별점 : 2개이상 Implements 받아서 기능 구현 가능
class Morning implements Greet, Bye {

	@Override
	public void bye() {
		System.out.println("안녕히가세요");
	}

	@Override
	public void greet() {
		System.out.println("안녕하세요");
		
	}
	
}

public class Meet {

	public static void main(String[] args) {
		Morning morning = new Morning();
		morning.bye();
		morning.greet();
	}

}
