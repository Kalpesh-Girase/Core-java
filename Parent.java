package Interface;

public interface Parent {

	void m1();
	void m2();
	
	default void m3() {
		System.out.println("This is Default Method");
	}
	
	public static void m4() {
		System.out.println("This is Static Method ");
	}
	
	
}
