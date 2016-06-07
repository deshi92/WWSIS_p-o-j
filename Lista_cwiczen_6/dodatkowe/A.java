package dodatkowe;

public class A {
	
	public static void main(String[] args) throws Exception {
		new A().run();
	}
	
	public void run() throws Exception {
		try (A.B b = new A.B();) {
		}
	}

	public class B implements java.lang.AutoCloseable {
		
		B(){
			System.out.println("Sukces!");
			
		}

		@Override
		public void close() throws Exception {
		}
	}
}
