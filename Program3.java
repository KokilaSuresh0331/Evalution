package com.kokilasuresh.evalution1;

import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {
	public static ArrayList<Integer> addArrays(int[] arr1, int[] arr2) {
		ArrayList<Integer> result = new ArrayList<>();
		int carry = 0;
		int maxLength = Math.max(arr1.length, arr2.length);
		for (int i = 0; i < maxLength || carry > 0; i++) {
			int sum = carry;

			if (i < arr1.length) {
				sum += arr1[arr1.length - 1 - i];
			}

			if (i < arr2.length) {
				sum += arr2[arr2.length - 1 - i];
			}

			carry = sum / 10;
			result.add(0, sum % 10);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arr1 size");
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter arr2 size");
		int n = sc.nextInt();
		int[] arr2 = new int[m];
		for (int j = 0; j < n; j++) {
			arr1[j] = sc.nextInt();
		}
		ArrayList<Integer> result = addArrays(arr1, arr2);

		for (int num : result) {
			System.out.print(num);
		}
		System.out.println();
	}
}
