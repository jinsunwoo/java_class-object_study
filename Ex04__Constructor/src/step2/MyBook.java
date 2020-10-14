/* * 개발자가 매개변수가 있는 생성자를 만든 경우, 디폴트 생성자를 호출하면 에러가 발생한다. 이 경우 매개변수가 없는 디폴트 생성자를 호출하기 위해서는
 * 디폴트 생성자도 같이 구현해줘야 한다. 
 * 
 * 복제 생성자: 동일한 클래스의 오브젝트를 인수로 받아서, 대응하는 필드의 값을 대입하는 생성자를 복제 생성자라 함
 */
package step2;

class Book {
	String title;
	int price;
	
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	// 복제 생성자 
	Book(Book copy) {
		title = copy.title;
		price = 20000;
	}
	
	void print() {
		System.out.println("제목:" + title);
		System.out.println("가격:"  + price);
	}
}
public class MyBook {

	public static void main(String[] args) {
		//Book book1 = new Book(); // 기본생성자 외의 생성자를 만들은 상태에서 기본생성자를 따로 설정하지 않았기 때문에 default 기본생성자를 쓸 수 없음
		Book book1 = new Book("자바클래스의 이해",10000);
	    book1.print();
	    
	    Book book2 = new Book(book1);
	    book2.title = "자바 디자인 패턴";
	    book2.print();
	    
	    Book book3 = new Book(book2);
	    book3.print();
	}

}
