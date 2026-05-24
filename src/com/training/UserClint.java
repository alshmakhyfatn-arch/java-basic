package com.traning;

import java.util.Scanner;

public class UserClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many users do you want to create? ");
		int count = sc.nextInt();
		sc.nextLine();

		User[] users = new User[count];

		for (int i = 0; i < count; i++) {

			System.out.println("\n--- Enter details for User " + (i + 1) + " ---");

			System.out.print("Enter User ID: ");
			String userId = sc.nextLine();

			System.out.print("Enter User Name: ");
			String userName = sc.nextLine();

			System.out.print("Enter User Email: ");
			String userEmail = sc.nextLine();

			users[i] = new User(userId, userName, userEmail);
		}

		if (count >= 3) {
			System.out.println("\n--- 3rd User Details ---");
			System.out.println("User ID    : " + users[2].getUserId());
			System.out.println("User Name  : " + users[2].getUserName());
			System.out.println("User Email : " + users[2].getUserEmail());
		} else {
			System.out.println("\nNot enough users created to display the 3rd user.");
		}

		sc.close();
	}
}
