package com.training;
import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<3) {
            System.out.println("Enter X to exit or any other key to continue");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("X")) {
            	break;
            }

        	i++;
        
        System.out.println("Enter first name for customer:"+i);
        sc.nextLine();
        System.out.println("Enter last name for customer:"+i);
        sc.nextLine();
        System.out.println("Enter age for customer:"+i);
        sc.nextLine().charAt(0);
       
        }

            System.out.println("total number of customers saved: "+i);
            for(int j = 0; j<3;j++) {
                System.out.println("number of iteration:"+ j+1);
            }
                int k=0;
                do {
                    System.out.println("Inside do while loop");
                    k++;
                    
                
                  

                }
                while(k<3);
        }
}



//java is a strongly typed language
//variable is a placeholder pointing to memory location

//create variable that will store customer first name, 
//customer last name, customer age
// and display all the customer details in a single line 
//take customer details from user using scanner class
//check if the customer is more than 18 then display
//eligible to open an account 
// else display: not yet eligible to open an account.


public class Demo {

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
		