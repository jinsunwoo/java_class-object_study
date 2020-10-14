/* 개발자가 생성자를 따로 기술하지 않는 경우, 인수가 없는 생성자가 자동으로 만들어 진다. 이것을 디폴트 생성자라고 한다. 
 * 생성자는 가장 흔한 오버로딩의 대상. */
package step1;

class Book {
	String title;
	int price;
	int num;
	
	Book() {
	    this.title = "자바 클래스 기초";
		this.price = 10000;
	}
	
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	void print() {
		System.out.println("제 목: " + this.title);
		System.out.println("가격: " + this.price);
		System.out.println("주문수량: " + this.num);
		System.out.println("합계: " + this.price * this.num);
	}
}

public class MyBook {

	public static void main(String[] args) {
		Book book = new Book("디자인 패턴",20000);
	    book.num = 5;
	    book.print();
	}
}
