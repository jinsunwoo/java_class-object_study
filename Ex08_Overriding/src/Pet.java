/*
 * 하위클래스에서 상속 받은 메서드를 단순 재사용 하지 않고 재정의 하고 싶을 때 (기능 변경/기능 추가)
 * 오버라이딩 사용시 상속된 메서드와 동일한 이름, 동일한 인수를 가지는 메서드를 정의 하여야 덮어 씌어짐.
 * 반환 값의 타입도 같아만 함.
 * 
 * 오버라이딩 vs 오버로딩:
 * 오버라이딩 : 상속의 관계서 발생
 * 오버 로딩 : 한 클래스 내에서 동일한 이름의 메서드가 여러개 존재 한다. 
 * 
 */
class Animal {
	String name;
	int age;
	
	void printPet() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}

class Dog extends Animal {
	String variety;
	
	void printPet() {
		// 기능을 확장해서 사용하고 싶을 때 (기능추가)
		super.printPet();
		System.out.println("종류: " + variety);
	}
}

class Cat extends Animal {
	String variety;
	// 기능을 아예 변경해서 사용하고 싶을 때
	void printPet() {
		System.out.println("종류: " + variety);
	}
}

public class Pet {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "진돌이";
		dog.age = 5;
		dog.variety = "진돗개";
		dog.printPet();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.name = "양이";
		cat.age = 7;
		cat.variety = "mixed";
		cat.printPet();
	}

}
