package com.training;


import java.util.ArrayList;
import java.util.Scanner;
public class ask {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.print("How many names do you want to enter? ");
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println("Names saved successfully.");
        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();
        if (names.contains(searchName)) {
            System.out.println("Name found");

        } else {
            System.out.println("Name not found");
        }
        sc.close();
    }
}