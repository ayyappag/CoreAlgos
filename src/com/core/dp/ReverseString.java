package com.core.dp;

import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {

        String input = "Geeks For Geeks";
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;
 
        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }  // use while loop also
 
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
        System.out.println("next approach");
        
        Stream.of(temparray).forEach(System.out::println);
        
        System.out.println("next approach");
        
        
       
	}
}
