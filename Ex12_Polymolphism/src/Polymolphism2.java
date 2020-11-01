/* 다형성 interface 에서의 사용 예, 여기서는 잘 됨. (extends 와의 차이 기억할 것)
 * (정리) 누가 누구한테 상속 받았고.. 와 같은 계층구조가 필요할때는 상속 사용.
 *       단지 기능만 제공하고 싶을때는 interface 사용. 
 *  */
// interface 의 method 는 항상 abstract method(meaning it only declares but does not specify) 
interface Printable {
	int inkSize = 10;
	void print(String doc);
}

class PrnDrvSamsung implements Printable {
	// overriding print from Printable
	public void print(String doc) {
		System.out.println(doc + "\nFrom Samsung : Black_White Ver");
	}
}

class PrnDrvEpson implements Printable {
	// overriding print from Printable 
	public void print(String doc) {
		System.out.println(doc + "\nFrom Epson : Black_White Ver");
	}
}

public class Polymolphism2 {
	
	public static void main(String[] args) {
		String doc = "프린터로 출력을 합니다.";
		
		Printable prn1 = new PrnDrvSamsung();
		prn1.print(doc);
		// 이렇게 하든 아래와 같이 그냥 바로 prn2.inkSize 하든 둘다 works! 
		System.out.println(Printable.inkSize);
		
		Printable prn2 = new PrnDrvEpson();
		prn2.print(doc);
		System.out.println(prn2.inkSize);
		
		PrnDrvSamsung prn3 = new PrnDrvSamsung();
		prn3.print(doc);
		
		
	}		
}
