package com.greatlearning.transaction;

import java.util.Scanner;

public class Transaction {

	public static void payMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction : ");
		int size = sc.nextInt();
		int[] transaction = new int[size];

		System.out.println("Enter the values : ");
		for (int i = 0; i < size; i++) {
			transaction[i] = sc.nextInt();
		}

		System.out.println("Enter the total number of targets to be achieve : ");
		int target = sc.nextInt();

		for (int i = 0; i < target; i++) {
			System.out.println("Enter the value of target : ");
			int targetvalue = sc.nextInt();
			int sum = 0;

			for (int j = 0; j < size; j++) {
				sum += transaction[j];

				if (sum >= targetvalue) {
					System.out.println("Target is achieved after transaction number : " + (j + 1));
					break;
				}
			}
			if (sum < targetvalue) {
				System.out.println("Target cannot be achieved ");
			}
		}
		sc.close();
	}
}
