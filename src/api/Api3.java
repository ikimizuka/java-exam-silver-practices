package api;

import java.util.ArrayList;

public class Api3 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("a");
		arrayList.add(1,"b");
		//ArrayListは最後に追加すること
		
		for(String str : arrayList) {
			System.out.println(str);
		}
	}

}

