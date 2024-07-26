package emailapp;

import javax.swing.*;
import java.awt.*;

public class EmailAppUI extends JFrame {
    private JTextField firstNameField, lastNameField;
    private JComboBox<String> departmentComboBox;
    private JButton createButton, showInfoButton;

    public EmailAppUI() {
        // Existing code

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        inputPanel.add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        inputPanel.add(firstNameField);
        inputPanel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        inputPanel.add(lastNameField);
        inputPanel.add(new JLabel("Department:"));
        String[] departments = {"Sales", "Development", "Accounting", "None"};
        departmentComboBox = new JComboBox<>(departments);
        inputPanel.add(departmentComboBox);
        createButton = new JButton("Create Email");
        inputPanel.add(createButton);
        showInfoButton = new JButton("Show Info");
        inputPanel.add(showInfoButton);

        // Add components to frame
        add(inputPanel, BorderLayout.NORTH);
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
