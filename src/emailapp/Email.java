package emailapp;

import java.util.Scanner;
class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "companydomain.com";

    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department.toLowerCase();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companySuffix;
    }

    // Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$½";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomValue = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    // Other methods (setters, getters) remain the same

    public String showInformation() {
        return "Name: " + firstName + " " + lastName +
                "\nDepartment: " + department +
                "\nCompany Email: " + email +
                "\nPassword: " + password +
                "\nMailbox Capacity: " + mailboxCapacity + "mb";
    }
}

