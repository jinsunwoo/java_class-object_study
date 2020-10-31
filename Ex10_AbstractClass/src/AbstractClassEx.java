/* <추상클래스>
 * 처리 내용을 기술하지 않고 호출하는 방법 만을 정의한 메서드를 "추상메서드"라고 한다. 
 * 추상 메서드를 한개라도 가진 클래스를 "추상 클래스" 라고 한다. 
 * 추상 메서드, 추상 클래스는 abstract 이라는 수식자를 이용하여 사용한다. 
 * 추상클래스를 상속하는 클래스는 반드시 추상메서드를 오버라이딩 해서 구현해야 한다. 
 * ex: animal 을 상속받는 클래스들이 반드시 cry 메서드를 만들었으면 좋겠는데, 어떻게 구현할지는 알아서 각자 다르게 하고 싶을 때 -> 추상 메서드 (추상클래스) 사용
 * 
 * */
abstract class Animal {
	int age = 5;
	abstract void cry(); 
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍");	
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.age); //5
		dog.cry(); // 
		
		Cat cat = new Cat();
		System.out.println(cat.age); // 5
		cat.cry(); // 야
		cat.age = 11;
		
		System.out.println(dog.age); // 5
		System.out.println(cat.age); // 11
		

	}

}
