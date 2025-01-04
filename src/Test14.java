

public class Test14 {

	public static void main(String[] args) {
		Sample13 a = new Sample13(10,"name");
		Sample13 b = new Sample13(10, "namae");
		System.out.println(a.equals(b));
		
	}

}

class Sample13 {
	private int num;
	private String  name;
	
	public Sample13 (int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		//objがSample13のオブジェクトかどうかチェック
		if (obj instanceof Sample13) {
			Sample13 s13 = (Sample13)obj;
			return s13.num == this.num;
		}
		return false;
	}
	
	
}