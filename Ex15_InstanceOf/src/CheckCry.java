interface Cry {
	void cry();
}

class Cat implements Cry {
	public void cry() {
		System.out.println("야옹");
	}
}

class Dog implements Cry {
	public void cry() {
		System.out.println("멍멍");
	}
}

public class CheckCry {

	public static void main(String[] args) {
		Cry test1 = new Cat();
		//Cry test1 = new Dog();
		
		if (test1 instanceof Cat) {
			test1.cry();
		} else {
			System.out.println("고양이가아닙니다");
		}
		
		// 번외로 스트링, 불린 등 타입도 체크 가능함
		String word = "monkey";
		System.out.println(word instanceof String);
		Boolean bl = false;
		System.out.println(bl instanceof Boolean);
		int[] arr = new int[] {1,2,3};
		System.out.println(arr instanceof int[]);
		// 다 되는데 int 만 안됨
		//int num = 10;
		//System.out.println(num instance of int);
	}
}
