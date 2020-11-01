/* Polymorphism(다형성)
 * 슈퍼클래스가 X 라 하고 서브클래스가 Y 라 할 때, X a = new Y(); 이렇게 오브젝트 생성이 가능하다. 
 * => 위와 같이 하위클래스 객체를 상위클래스 객체에 대입하여 사용 할 수 있다. 
 * => 반대의 경우는 불가 Y b = new X(); 
 * */
abstract class Calc {
	int a = 5;
	int b = 6;
	
	abstract void plus();
}

class MyCalc extends Calc {
	// overriding 받아서 개조했고
	void plus() { System.out.println(a+b);}
	// 새로 만들 었고
	void minus() { System.out.println(a-b);}
}

public class Polymolphism1 {
	public static void main(String[] args) {
		MyCalc myCalc1 = new MyCalc();
		myCalc1.plus();
		myCalc1.minus();
		
		// 하위 클래스 객체를 상위 클래스 객체에 대입
		Calc myCalc2 = new MyCalc();
		myCalc2.plus();
		// 다음 메서드는 설계도에 없다. 사용할 수 없다.
		//myCalc2.minus();
	}

}
