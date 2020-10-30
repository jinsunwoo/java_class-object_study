import java.util.Random;

// Just to show that static variable is loaded in memory before program starts. 
// initially when not assigned with value, int is 0 by default

public class StaticEx2 {
	static int num;
	
	//static {
	//	Random rand = new Random();
	//	num = rand.nextInt(100);
	//}
	
	public static void main(String[] args) {
		System.out.println(num);
	}
	

}
