

public class Test01 extends Sample{

	public static void main(String[] args) {
		var a = new Test01A();
		a = new Test01C();
		a.test();
	}

}


class Test01A{
	public void test() {
		System.out.println("A");
	}
}


class Test01B extends Test01A {
	
	@Override
	public void test() {
		System.out.println("B");
	}
}

class Test01C extends Test01A{
	@Override
	public void test() {
		System.out.println("C");
	}
}