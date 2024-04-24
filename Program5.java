package com.kokilasuresh.evalution1;

import java.util.Scanner;

public class Program5 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the pattern (odd number): ");
	        int n = scanner.nextInt();

	      /*  if (n % 2 == 0) {
	            System.out.println("Please enter an odd number.");
	            return;
	        }*/
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i == n - 1 - j) {
	                    System.out.print("1");
	                } else {
	                    System.out.print("0");
	                }
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}