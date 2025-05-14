
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    // Declare all components
    private JFrame frame;
    private JTextField display;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[9];
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton, negButton;
    private JPanel panel;
    
    private Font myFont = new Font("Arial", Font.BOLD, 20);
    
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    
    public Calculator() {
        // Setup the frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        
        // Setup the display
        display = new JTextField();
        display.setBounds(50, 25, 300, 50);
        display.setFont(myFont);
        display.setEditable(false);
        
        // Initialize function buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("×");
        divButton = new JButton("÷");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("DEL");
        clrButton = new JButton("CLR");
        negButton = new JButton("±");
        
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;
        
        // Set up the action listener and appearance for function buttons
        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        
        // Initialize number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }
        
        // Position the delete, clear and negative buttons
        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);
        
        // Set up the panel for the grid buttons
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        
        // Add buttons to the panel in a calculatorlike layout
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(divButton);
        
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(mulButton);
        
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(subButton);
        
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(addButton);
        
        // Add components to the frame
        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(display);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle digit buttons
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }
        
        // Handle decimal button
        if (e.getSource() == decButton) {
            // Check if display already has a decimal point
            if (!display.getText().contains(".")) {
                display.setText(display.getText().concat("."));
            }
        }
        
        // Handle operation buttons
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
        }
        
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display.setText("");
        }
        
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");
        }
        
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
        }
        
        // Handle equals button
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(display.getText());
            
            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            
            // Display the result and prepare for next calculation
            display.setText(String.valueOf(result));
            num1 = result;
        }
        
        // Handle clear button
        if (e.getSource() == clrButton) {
            display.setText("");
        }
        
        // Handle delete button
        if (e.getSource() == delButton) {
            String currentText = display.getText();
            if (!currentText.isEmpty()) {
                // Remove the last character
                display.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
        
        // Handle negative/positive toggle button
        if (e.getSource() == negButton) {
            String currentText = display.getText();
            if (!currentText.isEmpty() && !currentText.equals("0")) {
                double value = Double.parseDouble(currentText);
                value *= -1;
                display.setText(String.valueOf(value));
            }
        }
    }
} 