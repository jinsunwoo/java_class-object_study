package com.company.length;

public class Circle {
	final double PI = 3.14;
	double rad;
	
	public void setRad(double r) {
		this.rad = r;
	}
	
	// 원의 둘레 반환
    public double getPerimeter() {
    	return (this.rad * 2) * this.PI;
    }

	 

}
