/* 
 * Static 은 필드와 메서드에 붙이는 제한자
 * 
 * static 을 붙인 멤버의 특징:
 * 1) 프로그램 시작 전에 메모리에 로딩된다. (메서드 영역에 로딩 됨)
 * 2) 오브젝트를 생성하지 않고도 필드, 메서드 사용이 가능하다.(클래스 명 사용해야 ) ex: Cat.a
 * 
 * 같은 클래스에서 생성된 오브젝트들은 static 을 붙인 필드의 값을 공유한다. ex: a 값이 예를 들면 cat2 오브젝트에서 바꼈어도 cat1 등 모든 Cat 의 오브젝트들에서 동일하게 변경 됨. 
 * 
 * 어떤 오브젝트에서도 같은 동작을 하는 메서드는 static 키워드를 붙여주는 것이 좋다 -> 한 번만 생성이 된다. 
 * 
 * method 의 static : 대표적인 예) 메인 함수
 * static 을 붙인 메서드의 특징:
 * 1) static 메서드는 오버라이딩 할 수 없다.
 * 2) static 메서드에서 동일한 오브젝트 내의 멤버를 이용하기 위해서는 멤버에게 static 을 붙여야만 한다. ex: 아래의 sta 변수는 static 을 붙여야 static main 함수내에서 사용 가능.  
 * */

class Cat {
	static int a = 5;
	int num = 3;
	
	void Print(int num3) {
		System.out.println("a: "+a);
		num = num3;
		System.out.println("num: "+num);
	}
}

public class StaticEx1 {
	// static 메소드에서 사용하려면 변수에도 static 을 붙여줘야 한다. 
	static int sta = 3;
	
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + "," + num2); // 5,2
	    System.out.println(Cat.a); // 5
	    
	    System.out.println(sta);
		
		Cat cat1 = new Cat();
		cat1.num = 1; 
		cat1.a = 10;
		cat1.Print(20); // a: 10  num: 20 
		System.out.println(cat1.num); // 20
		System.out.println(cat1.a); // 10
		
		Cat cat2 = new Cat();
		cat2.num =2;
		cat2.a = 11;
		cat2.Print(20); // a: 11 num 20
		System.out.println(cat2.num); // 20 
		System.out.println(cat2.a); // 11
		System.out.println(cat1.a); // 11
	}

}
