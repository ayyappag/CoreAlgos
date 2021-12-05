package com.core.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashCode {

	public static void main(String[] args) {

		MyMap<String, Integer> map = new MyMap<String, Integer>();
		map.put("a", 1);
		map.put("s", 2);
		map.put("f", 3);
		map.put("1f", 13);
		map.put("Lars", 5);
		System.out.println("hi");
		map.get("Lars");

		map.remove("f");
		map.keySet();
	}
}
