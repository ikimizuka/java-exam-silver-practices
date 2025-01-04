

public class Test12 {

	public static void main(String[] args) {
		Sample12 s1 = new Sample12(10);
		Sample12 s2 = s1;
		s1 = new Sample12(10);
		
		System.out.println(s1 == s2);
		//同じインスタンスではないためfalseになる
	}

}

class Sample12 {
	private int num;
	
	public Sample12 (int num) {
		this.num = num;
	}
}