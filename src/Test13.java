

public class Test13 {

	public static void main(String[] args) {
		Object a = new Sample14(10);
		Object b = new Sample14(10);
		System.out.println(a.equals(b));
		
	}

}

class Sample14 {
	private int num;
	
	public Sample14 (int num) {
		this.num = num;
	}
	
	public boolean equals(Sample14 obj) {
		if (obj == null) {
			return false;
		}
		

		return this.num == obj.num;
	}
	
	
}