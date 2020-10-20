/*
 * < 클래스 정의 대상의 public 과 default 선언의 차이 >
 * - public : 다른 패키지의 클래스들도 "패키지명으로 접근" 하면 인스턴스 생성 허용된다. 
 * - default : 같은 패키지로 묶인 클래스들 내에만 인스턴스 생성을 허용한다. 
 * 
 *  <인스턴스 멤버 대상 접근지시자 정리 >
 * 				클래스 내부	같은 패키지		상속받은 클래스		이외의 영역
 * private		   o			x				 x				x
 * default		   o			o				 x				x
 * protected	   o 			o				 o			    x
 * public		   o			o				 o				o
 * 
 */

package team1;
import team2.AnotherClass2;

public class AccessTest {
	public int num1;
	private int num2;
	protected int num3;
	int num4;
	
	public void test1() { System.out.println("test1"); }
	private void test2() { System.out.println("test2"); }
	protected void test3() { System.out.println("test3"); }
	void test4() { System.out.println("test4"); }

	public static void main(String[] args) {
		// 같은 클래스 내에서는 4가지 타입 모두 허용됨 
		AccessTest at = new AccessTest();
		at.num1 = 1;
		at.num2 = 2;
		at.num3 = 3;
		at.num4 = 4;
		
		// private 의 경우 같은 패키지 안에 있어도 다른 클래스라면 허용되지 않음
	    AnotherClass1 ac1 = new AnotherClass1();
	    ac1.num1 = 1;
	    // ac1.num2 = 2;
	    ac1.num3 = 3;
	    ac1.num4 = 4;
	    
	    // 다른 패키지의 경우 public 만 허용 됨
	    AnotherClass2 ac2 = new AnotherClass2();
	    ac2.num1 = 1;
	    //ac2.num2 = 2;
	    //ac2.num3 = 3;
	    //ac2.num4 = 4;	
	}

}
