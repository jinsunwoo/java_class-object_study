/* 은닉화: 클래스 안의 변수를 만들어 놓고 private 을 사용해서 감추는 것
 * 외부에서 접근 & 사용 하려면, getter & setter 사용
 */
class SimpleBox {
	private int num;

	SimpleBox(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}

public class ThisUseEx {
	public static void main(String[] args) {
		SimpleBox box = new SimpleBox(5); // num 을 5로 초기설정
		box.setNum(10); // num 을 10으로 재설정
		System.out.println(box.getNum()); // get num -> 10 
	}
}
