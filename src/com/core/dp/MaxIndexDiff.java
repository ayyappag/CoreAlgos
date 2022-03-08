package com.core.dp;

//https://practice.geeksforgeeks.org/problems/maximum-index-1587115620/1
public class MaxIndexDiff {

	public static void main(String[] args) {
		//int n = 9;
//		int a[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		int n=15;
		int a[] = { 65, 6, 74, 94, 56, 89, 9, 63, 75, 
				25, 34, 68, 93, 48, 16 };
		int index = maxIndexDiff(a, n);
		System.out.println("index " + index);
	}

	
	   // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        
       int i=0,j=1,k=0;
       
       for(j=1;j<N;j++)
       {
           if(A[j]>=A[i] && j>=i)
           {
               if(j-i >k)
               k=j-i;
           }
           if(j==N-1)
           {
               j=k+i+1;
               i++;
               
           }
           
       }
       
       System.out.println("i= " + i + " ; j = " + j);
       System.out.println("i= " + A[i] + " ; j = " + A[j]);
       return k;
        
    }
}
