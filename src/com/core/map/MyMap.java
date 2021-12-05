package com.core.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyMap<K, V> {
	private int size;
	private int default_capacity = 16;
	private MyEntry<K, V>[] values = new MyEntry[default_capacity];

	// implementation of get method
	// Need to pass the key value to the get(key) method
	public V get(K key) {
		for (int i = 0; i < size; i++) {
			if (values[i] != null) {
				if (values[i].getKey().equals(key)) {
					return values[i].getValue();
				}
			}

		}
		return null;
	}

	// put method . need to pass key and value to the method
	// need to check size
	// check key ( existing ( update ) or not ( insert) )
	public void put(K key, V value) {
		boolean inserted = true;
		for (int i = 0; i < size; i++) {
			if (values[i] != null) {
				if (values[i].getKey().equals(key)) {
					values[i].setValue(value);
					inserted = false;
				}
			}
		}
		if (inserted) {
			ensureCapa();
			values[size++] = new MyEntry<K, V>(key, value);
		}
	}

	private void ensureCapa() {
		if (size == values.length) {
			int newSize = values.length * 2;
			values = Arrays.copyOf(values, newSize);
		}
	}

	public int size() {
		return size;
	}

	// remove
	public void remove(K key) {
		for (int i = 0; i < size; i++) {
			if (values[i] != null) {
				if (values[i].getKey().equals(key)) {
					values[i] = null;
					--size;
					reConstructArray(i);
				}
			}

		}
	}

	private void reConstructArray(int start) {
		for (int i = start; i < size; i++) {
			values[i] = values[i + 1];
		}
	}

	public Set<K> keySet() {
		Set<K> set = new HashSet<K>();
		for (int i = 0; i < size; i++) {
			set.add(values[i].getKey());
		}
		return set;
	}

}
