package LamdaTest;

public class Lambda2 {

	public static void main(String[] args) {
		
		class MethodInMain implements Runnable{
			public void run() {
				System.out.println("hello");
			}
		}
		
		Runnable runner = new MethodInMain();
		runner.run();
		
	}
	


}
