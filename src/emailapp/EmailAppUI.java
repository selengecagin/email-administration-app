package emailapp;

import javax.swing.*;
import java.awt.*;

public class EmailAppUI extends JFrame {
    public EmailAppUI() {
        setTitle("Email Management System");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmailAppUI().setVisible(true);
            }
        });
    }
}
