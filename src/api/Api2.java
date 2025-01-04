package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Api2 {
	public static void main(String[] args) {
		SampleAPI1[] sample = {
				 new SampleAPI1(2, "B")
				,new SampleAPI1(3, "C")
				,new SampleAPI1(1, "A")};
		List<SampleAPI1> list = new ArrayList<SampleAPI1>(Arrays.asList(sample));
		list.sort(new SampleComparator());
		for(SampleAPI1 a : list) {
			System.out.println(a.getName());
		}
	}
}

class SampleAPI1{
	private int id;
	private String name;
	
	public SampleAPI1(int id ,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
}

class SampleComparator implements Comparator<SampleAPI1> {
	
	@Override
	public int compare(SampleAPI1 s1, SampleAPI1 s2) {
		if(s1.getId() < s2.getId()) {
			return 1;
		}
		if(s2.getId() < s1.getId()) {
			return -1;
		}
		return 0;
	}
}