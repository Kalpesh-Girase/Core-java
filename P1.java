package Interface;

public interface P1 {

	void fight();
	default void bike() {
		
	}
	
	public static void m2() {
	
	}
		
		public static void main(String[] args) {
			m2();// Static Method Called Bcz it Load By Class
			//P1 p = new P1(); Cannot Create the Object of Interface
		
	}
}


// 100% Abstraction Is Achieved , Because Static And Default Methods are not Implemented , they Are Implemented in
// child Class