

public class Test08 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abcde");
		sb.reverse();
		System.out.println(sb);
		sb.replace(1, 3, "a");//"dc"を“ａ”に置き換える
		System.out.println(sb);
		
	}

}