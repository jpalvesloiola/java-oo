package com.hackerrank.challenges.int_to_string;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			// String s=???; Complete this line below
			String s = "0";
			if (n >= -100 && 100 >= n) {
				s = "" + n;
			}

			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

