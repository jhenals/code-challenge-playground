package Blind75.Arrays;

import java.util.Arrays;

public class Rearrange {
  public static void Rearrange(int a[], int n)
	 /*
	  * You are given an array of size N. Rearrange the given array in-place such that
	  *  all the negative numbers occur before all non-negative numbers.
		(Maintain the order of all -ve and non-negative numbers as given in the original array).
	 	Ex. Input:
		N = 4
	 	Arr[] = {-3, 3, -2, 2}
	 	Output:
	 	-3 -2 3 2
	 	Explanation:
	 	 the given array, negative numbers
	 	are -3, -2 and non-negative numbers are 3, 2.
	  */ {
    // Your code goes here

    for (int i = 0; i < n - 1; i++) {
      if (a[i] > 0) {

      }
      int tmp1 = 0;
      int tmp2 = 0;

      if (a[i] < 0) {
        for (int j = i + 1; j < n - 1; j++) {
          if (a[j] < 0) {
            if (a[i] > a[j]) {
              tmp1 = a[i];
              tmp2 = a[i + 1];
              a[i] = a[j];
              a[i + 1] = tmp1;
              a[j] = tmp2;
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    int N = 4;
    int A[] = {-3, 3, -2, 2};
    Rearrange(A, N);
    System.out.println(Arrays.toString(A));


  }
}
