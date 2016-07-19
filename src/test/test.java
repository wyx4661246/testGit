package test;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.forEach(o -> {System.out.println(o);}); 
	}

		

}
