package LamdaTest;

public class Lambda4 {

	public static void main(String[] args) {
		
		Runnable runner = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello");
				
			}
		};
		
		runner.run();
		
	}
	


}
