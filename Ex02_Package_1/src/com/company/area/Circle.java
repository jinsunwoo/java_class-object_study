/*
 * 패키지 선언이 필요한 상황:
 * 1) 공간에서의 충돌 (동일 이름의 클래스 파일은 같은 위치에 둘 수 없다.
 * 2) 접근방법에서의 충돌 (인스턴스 생성 방법서 두 클래스에 차이가 없다. 
 * 
 * public : 클래스를 다른 패키지에서 이용할 수 있게 한다. 
 * */


package com.company.area;

public class Circle {
	double rad;
	final double PI = 3.14;
	
	public void setRad(double r) {
		this.rad = r;
	}
	
	// 원의 넓이 반환
	public double getArea() {
		return (this.rad * this.rad) * this.PI;
	}
}
