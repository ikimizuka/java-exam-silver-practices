package LamdaTest;

import java.util.ArrayList;

public class Lambda9 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		for(String str : list) {
			if("D".equals(str)) {
				list.remove("D");
			}else {
				System.out.println(str);
			}
		}
		
		for(String str: list) {
			System.out.println(str);
		}

		
	}



}
