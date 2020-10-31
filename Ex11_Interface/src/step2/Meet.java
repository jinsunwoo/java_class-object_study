package step2;
 
interface Greet {
	void greet();
}

interface Bye extends Greet {
	void bye();
}

// Bye 를 implements 받았는데 Bye 는 Greet 을 extends 받은거기 때문에 greet(); 을 override, bye() 도 override 해줘야 함
class Morning implements Bye {
	public void bye() {
		System.out.println("안녕히계세요");
	}

	public void greet() {
		System.out.println("안녕하세요");
	}
	
	
}

public class Meet {
	public static void main(String[] args) {
		Morning morning = new Morning();
		morning.bye();
		morning.greet();
		
		
	}
}
