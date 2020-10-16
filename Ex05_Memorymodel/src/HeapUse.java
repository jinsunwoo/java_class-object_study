class Book {
	String title;
}

public class HeapUse {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "자바";
		
		Book book2 = book1; // book2 찹조변수의 참조주소(힙에서)가 book1 과 동일하게 된
		System.out.println("Book1's title: " + book1.title); // "자바"
		System.out.println("Book2's title: " + book2.title); // "자바"
		
		book2.title = "파이썬"; // book1 도 같은 참조 주소(힙) 가르키고 있기 때문에 같이 바뀜
		System.out.println("Book1's title: " + book1.title); // "파이썬"
		System.out.println("Book2's title: " + book2.title); // "파이썬"
		
		
		
		
	}

}
