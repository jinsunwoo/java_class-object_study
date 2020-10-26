/*
 * 상속: 상위클래스(super class)의 모든것이 하위클래스(sub class)에 전달 되는 것.
 * 상위 클래스의 멤버변수 & 멤버함수 중 private 으로 접근제한이 된 경우에는 하위클래스로 전달 되지 않는다.
 * 여러클래스를 동시에 상속하는 다중상속은 허용되지 않는다. 
 */
class Book {
	String title;
	
	void printBook() {
		System.out.println("제목: " + title);
	}
}

class Novel extends Book {
	String writer;
	
	void printNov() {
		printBook();
		System.out.println("저자: " + writer);
	}
	
}

class Magazine extends Book {
	Integer day;
	
	void printMag() {
		printBook();
		System.out.println("발매일: " + day);
	}
	
}

public class Bookshelf {
	public static void main(String[] args) {
		Novel nov = new Novel();
		nov.title = "홍길동전";
	    nov.writer = "허균";
	    
	    Magazine mag = new Magazine();
	    mag.title = "월간자바";
	    mag.day = 20;
	    
	    nov.printNov();
	    System.out.println();
	    mag.printMag();
	}

}
