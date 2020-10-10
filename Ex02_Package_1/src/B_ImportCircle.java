/*
 * import 를 사용할 경우, "A_CircleUsing" 처럼 인스턴스 생성할때 패키지 명을 다 입력할 필요 없음
 * 다만, 두개 이상의 패지키 사용할 경우 "A_CircleUsing" 방법으로 해야 함 (해당 예시에서는 Circle 이라는 같은 이름의 클래스가 다른 패키지에 있기 때문에
 * import 를 두개 해버리면 아래에서 인스턴스화 할때 Circle 이 2개 라서 혼돈이 옴.
 * Hence, 둘 패키지의 Circle 을 모두 사용하고 싶은 경우는 "A_CircleUsing" 방식을 사용할 것
 */

import com.company.area.Circle;

public class B_ImportCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRad(5);
		System.out.println("반지름 5 원 넓이 : " + c1.getArea());
		
		Circle c2 = new Circle();
		c1.setRad(3.5);
		System.out.println("반지름 3.5 원 넓이 : " + c2.getArea());
		 
	}
}


