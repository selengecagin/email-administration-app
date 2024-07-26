package emailapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailAppUI extends JFrame {
    private Email email;
    private JTextField firstNameField, lastNameField;
    private JComboBox<String> departmentComboBox;
    private JTextArea infoArea;
    private JButton createButton, showInfoButton;

    public EmailAppUI() {
        setTitle("Email Management System");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

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

        // Info Area
        infoArea = new JTextArea();
        infoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(infoArea);

        // Add components to frame
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Action Listeners
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String department = (String) departmentComboBox.getSelectedItem();
                if (!firstName.isEmpty() && !lastName.isEmpty()) {
                    email = new Email(firstName, lastName, department);
                    JOptionPane.showMessageDialog(EmailAppUI.this, "Email created successfully!");
                } else {
                    JOptionPane.showMessageDialog(EmailAppUI.this, "Please enter both first and last name.");
                }
            }
        });

        showInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (email != null) {
                    infoArea.setText(email.showInformation());
                } else {
                    infoArea.setText("Please create an email first.");
                }
            }
        });
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