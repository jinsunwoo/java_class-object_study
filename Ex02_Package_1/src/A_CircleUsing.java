/*
 * 페키지명.클래스 로 접근하면 다른 패키지안의 클래스들도 이렇게 접근 가능
 * 현재 이 파일은 defaultpackage 
 */
public class A_CircleUsing {
	public static void main(String[] args) {
		com.company.area.Circle c1 = new com.company.area.Circle();
		c1.setRad(5);
		System.out.println("반지름 5 원 넓이 : " + c1.getArea());
		
		com.company.length.Circle c2 = new com.company.length.Circle();
		c2.setRad(5);
		System.out.println("반지름 5 원 둘레 : " + c2.getPerimeter());
		
	}
}
