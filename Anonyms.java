package Interface;

public interface Anonyms {
	
	void m1();
	
	
	public static void main(String[] args) {
		Anonyms m = new Anonyms() {
			
			@Override
			public void m1() {
				System.err.println("The Class Having No Name It's Called Anonyms class");
				
			}
		};
		m.m1();
	}

}
