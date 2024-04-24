package com.kokilasuresh.evalution1;

import java.util.Scanner;

public class Program1 {
	public static void main(String args[]) {
		int rows, i, j;
		char ch = 'A';
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();

		System.out.print("Diamond Shape Pattern: \n\n");

		for (i = 0; i <= rows; i++) {
			for (j = rows; j > i; j--)
				System.out.print(" ");

			System.out.print(ch);

			for (j = 0; j < (i * 2 - 1); j++)
				System.out.print(" ");

			if (i != 0)
				System.out.print(ch);

			System.out.println();
			ch++;
		}
		ch -= 2;
		for (i = rows - 1; i >= 0; i--) {
			for (j = rows; j > i; j--)
				System.out.print(" ");

			System.out.print(ch);

			for (j = 0; j < (i * 2 - 1); j++)
				System.out.print(" ");

			if (i != 0)
				System.out.print(ch);

			System.out.println();
			ch--;
		}
	}
}