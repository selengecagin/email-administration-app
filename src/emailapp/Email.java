package emailapp;

import java.util.Scanner;

public class Email {
   private String firstName;
   private  String lastName;
   private String password;
   private String department;
   private int mailboxCapacity;
   private String alternateEmail;

//Constructor to receive firstName and lastName
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email Created: " + this.firstName+" "+this.lastName);
        //Call a method asking for the department, return the department

        this.department = setDepartment();
    }


//Ask for the department
    public String setDepartment() {
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if(deptChoice == 1){
            return "sales";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "acct";
        }else {
            return "";
        }
    }


//Generate random password
//Set the mailbox capacity
//Set the alternate email
//Change the password


}

