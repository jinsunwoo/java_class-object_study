/* 클래스 간의 형변환
 * Super a = new Sub();
 * Sub b = (Sub)a;
 * 위와 같이 서브클래스로 생성되었던 오브젝를 슈퍼클래스의 오브젝트에 대입한 경우,
 * 다시 서브클래스로 형변환 할 수 있다. 
 * */
class PBoard {}

class CBoard extends PBoard {}

public class ClassCast {

	public static void main(String[] args) {
		// 서브클래스로 만든 걸 슈퍼클래스에 대입
		PBoard sbd1 = new CBoard();
		// 생성된 참조변수 이용해서 형변환해서 다시 서브클래스에 대입
		CBoard sbd2 = (CBoard) sbd1; // Works fine!
		
	    System.out.println("-------------");
	    
	    // 부모를 자식으로 형변환 -> syntax 상으로는 맞아보여서 빨간줄 안뜨지면 실행하면 Not working!  
	    PBoard ebd1 = new PBoard();
	    CBoard ebd2 = (CBoard)ebd1;
		
	}

}
