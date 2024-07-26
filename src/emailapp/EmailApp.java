package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John","Doe");
        email.setAlternateEmail("js@gmail.com");
        System.out.println(email.getAlternateEmail());



    }
}
