package emailapp;

import java.util.Scanner;

public class Email {
   private String firstName;
   private  String lastName;
   private String password;
   private String email;
   private String department;
   private int mailboxCapacity = 500;
   private int defaultPasswordLength =10;
   private String alternateEmail;
   private String companySuffix = "companydomain.com";

//Constructor to receive firstName and lastName
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email Created: " + this.firstName+" "+this.lastName);

        //Call a method asking for the department, return the department
        this.department = setDepartment();
        System.out.println("Department: "+this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: "+ this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
        System.out.println("Your email is: "+ email);

    }

//Ask for the department
    public String setDepartment() {
        System.out.println("Department Codes \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if(deptChoice == 1){
            return "sales";
        } else if (deptChoice == 2) {
            return "development";
        } else if (deptChoice == 3) {
            return "accounting";
        }else {
            return "";
        }
    }

//Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$½";
        char[] password = new char[length];
        for(int i =0;i<length;i++){
            //generate random number
         int randomValue = (int)(Math.random() * passwordSet.length());
         password[i] =passwordSet.charAt(randomValue);
        }
        return new String(password) ;
    }

//Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }


//Set the alternate email
//Change the password


}

