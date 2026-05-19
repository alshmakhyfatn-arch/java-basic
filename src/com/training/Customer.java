package com.training;
import java.util.Scanner;




//java is a strongly typed language
//variable is a placeholder pointing to memory location

//create variable that will store customer first name, 
//customer last name, customer age
// and display all the customer details in a single line 
//take customer details from user using scanner class
//check if the customer is more than 18 then display
//eligible to open an account 
// else display: not yet eligible to open an account.


public class Customer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer age: ");
        int customerAge = sc.nextInt();

        if (customerAge > 18) {
            System.out.println("Eligible to open account");
        } else {
            System.out.println("Not yet eligible to open account");
        }
    }
}
	
		//next () -> will take single string 
		//nextInt() -> to input integer value 
		