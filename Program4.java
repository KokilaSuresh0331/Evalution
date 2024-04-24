package com.kokilasuresh.evalution1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.println("Enter the array values:");
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		int maxSum = 0;
		int currentSum = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				currentSum += arr[i];
				if (currentSum > maxSum) {
					maxSum = currentSum;

					end = i;
					if (start == -1)
						start = i;

				}
			} else {
				currentSum = 0;

			}
		}

		System.out.println("Sum: " + maxSum);
		System.out.print("Elements: ");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]);
			if (i != end) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

}
