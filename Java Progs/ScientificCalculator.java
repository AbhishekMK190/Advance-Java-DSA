import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class ScientificCalculator implements ActionListener {
    // Declare all components
    private JFrame frame;
    private JTextField display;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[22]; // Added 2 more for parentheses
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton, negButton;
    private JButton sinButton, cosButton, tanButton, logButton, sqrtButton;
    private JButton powerButton, factButton, piButton, eButton, modButton;
    private JButton leftParenButton, rightParenButton; // New buttons for parentheses
    private JPanel panel, scientificPanel;
    private JCheckBox scientificMode;
    
    private Font myFont = new Font("Arial", Font.BOLD, 18);
    private Font resultFont = new Font("Arial", Font.BOLD, 24);
    
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    private StringBuilder expression = new StringBuilder(); // For storing the full expression
    private int parenCount = 0; // To track open parentheses
    
    public ScientificCalculator() {
        // Setup the frame
        frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(240, 240, 240));
        
        // Setup the display
        display = new JTextField();
        display.setBounds(50, 25, 380, 60);
        display.setFont(resultFont);
        display.setEditable(false);
        display.setBackground(new Color(240, 255, 240));
        display.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        
        // Scientific mode toggle
        scientificMode = new JCheckBox("Scientific Mode");
        scientificMode.setBounds(50, 90, 150, 30);
        scientificMode.addActionListener(this);
        
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
        
        // Scientific operation buttons
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        logButton = new JButton("log");
        sqrtButton = new JButton("√");
        powerButton = new JButton("x^y");
        factButton = new JButton("x!");
        piButton = new JButton("π");
        eButton = new JButton("e");
        modButton = new JButton("%");
        
        // Parentheses buttons
        leftParenButton = new JButton("(");
        rightParenButton = new JButton(")");
        
        // Add function buttons to array
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;
        
        // Scientific function buttons
        functionButtons[9] = sinButton;
        functionButtons[10] = cosButton;
        functionButtons[11] = tanButton;
        functionButtons[12] = logButton;
        functionButtons[13] = sqrtButton;
        functionButtons[14] = powerButton;
        functionButtons[15] = factButton;
        functionButtons[16] = piButton;
        functionButtons[17] = eButton;
        functionButtons[18] = modButton;
        
        // Parentheses buttons
        functionButtons[19] = leftParenButton;
        functionButtons[20] = rightParenButton;
        
        // Set up the action listener and appearance for function buttons
        for (int i = 0; i < 21; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(new Color(220, 220, 220));
        }
        
        // Special styling for equals button
        equButton.setBackground(new Color(70, 130, 180));
        equButton.setForeground(Color.WHITE);
        
        // Initialize number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(250, 250, 250));
        }
        
        // Position the delete, clear and negative buttons
        negButton.setBounds(50, 570, 100, 50);
        delButton.setBounds(160, 570, 100, 50);
        clrButton.setBounds(270, 570, 100, 50);
        
        // Set up the panel for the standard calculator buttons
        panel = new JPanel();
        panel.setBounds(50, 130, 380, 320);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(240, 240, 240));
        
        // Add buttons to the panel in a calculator layout
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
        
        // Set up the scientific panel
        scientificPanel = new JPanel();
        scientificPanel.setBounds(50, 460, 380, 100);
        scientificPanel.setLayout(new GridLayout(3, 5, 10, 10)); // Changed to 3 rows to accommodate parentheses
        scientificPanel.setBackground(new Color(240, 240, 240));
        scientificPanel.setVisible(false); // Hidden by default
        
        // Add scientific buttons
        scientificPanel.add(sinButton);
        scientificPanel.add(cosButton);
        scientificPanel.add(tanButton);
        scientificPanel.add(logButton);
        scientificPanel.add(sqrtButton);
        scientificPanel.add(powerButton);
        scientificPanel.add(factButton);
        scientificPanel.add(piButton);
        scientificPanel.add(eButton);
        scientificPanel.add(modButton);
        scientificPanel.add(leftParenButton);
        scientificPanel.add(rightParenButton);
        // Empty spaces to maintain layout
        for (int i = 0; i < 3; i++) {
            scientificPanel.add(new JLabel());
        }
        
        // Add components to the frame
        frame.add(display);
        frame.add(scientificMode);
        frame.add(panel);
        frame.add(scientificPanel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ScientificCalculator();
    }
    
    // Helper method to handle potential input errors
    private double parseInput() {
        try {
            if (display.getText().isEmpty()) {
                return 0;
            }
            return Double.parseDouble(display.getText());
        } catch (NumberFormatException e) {
            display.setText("Error");
            return 0;
        }
    }
    
    // Calculate factorial
    private double factorial(double n) {
        if (n < 0) return Double.NaN; // Factorial not defined for negative numbers
        if (n > 170) return Double.POSITIVE_INFINITY; // Limit to avoid overflow
        
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Format result to avoid unnecessary decimal places
    private String formatResult(double result) {
        if (result == (long) result) {
            return String.format("%d", (long) result);
        } else {
            return String.format("%s", result);
        }
    }
    
    // Evaluate expressions with parentheses
    private double evaluateExpression(String expr) {
        try {
            return new ExpressionEvaluator().evaluate(expr);
        } catch (Exception e) {
            return Double.NaN;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle scientific mode toggle
        if (e.getSource() == scientificMode) {
            scientificPanel.setVisible(scientificMode.isSelected());
            // Adjust frame size based on mode
            if (scientificMode.isSelected()) {
                frame.setSize(500, 700);
            } else {
                frame.setSize(500, 600);
            }
            return;
        }
        
        // Handle digit buttons
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
                expression.append(i);
                return;
            }
        }
        
        // Handle decimal button
        if (e.getSource() == decButton) {
            // Check if display already has a decimal point
            if (!display.getText().contains(".")) {
                display.setText(display.getText().concat("."));
                expression.append(".");
            }
        }
        
        // Handle clear button
        else if (e.getSource() == clrButton) {
            display.setText("");
            expression.setLength(0); // Clear the expression
            parenCount = 0; // Reset parentheses count
        }
        
        // Handle delete button
        else if (e.getSource() == delButton) {
            String currentText = display.getText();
            if (!currentText.isEmpty()) {
                // Remove the last character
                display.setText(currentText.substring(0, currentText.length() - 1));
                
                // Update expression and parentheses count
                if (expression.length() > 0) {
                    char lastChar = expression.charAt(expression.length() - 1);
                    if (lastChar == '(') parenCount--;
                    else if (lastChar == ')') parenCount++;
                    
                    expression.deleteCharAt(expression.length() - 1);
                }
            }
        }
        
        // Handle negative/positive toggle button
        else if (e.getSource() == negButton) {
            String currentText = display.getText();
            if (!currentText.isEmpty() && !currentText.equals("0")) {
                double value = Double.parseDouble(currentText);
                value *= -1;
                String formattedValue = formatResult(value);
                display.setText(formattedValue);
                
                // Update expression - replace the current number with the negative version
                int lastIndex = Math.max(0, findLastNumberStart(expression.toString()));
                expression.replace(lastIndex, expression.length(), formattedValue);
            }
        }
        
        // Handle parentheses
        else if (e.getSource() == leftParenButton) {
            expression.append("(");
            display.setText(display.getText() + "(");
            parenCount++;
        }
        
        else if (e.getSource() == rightParenButton) {
            if (parenCount > 0) {
                expression.append(")");
                display.setText(display.getText() + ")");
                parenCount--;
            }
        }
        
        // Handle basic operation buttons
        else if (e.getSource() == addButton) {
            expression.append("+");
            display.setText(display.getText() + "+");
        }
        
        else if (e.getSource() == subButton) {
            expression.append("-");
            display.setText(display.getText() + "-");
        }
        
        else if (e.getSource() == mulButton) {
            expression.append("*");
            display.setText(display.getText() + "×");
        }
        
        else if (e.getSource() == divButton) {
            expression.append("/");
            display.setText(display.getText() + "÷");
        }
        
        else if (e.getSource() == modButton) {
            expression.append("%");
            display.setText(display.getText() + "%");
        }
        
        else if (e.getSource() == powerButton) {
            expression.append("^");
            display.setText(display.getText() + "^");
        }
        
        // Handle constant buttons
        else if (e.getSource() == piButton) {
            String piValue = String.valueOf(Math.PI);
            display.setText(display.getText() + piValue);
            expression.append(piValue);
        }
        
        else if (e.getSource() == eButton) {
            String eValue = String.valueOf(Math.E);
            display.setText(display.getText() + eValue);
            expression.append(eValue);
        }
        
        // Handle scientific function buttons
        else if (e.getSource() == sinButton || 
                 e.getSource() == cosButton || 
                 e.getSource() == tanButton || 
                 e.getSource() == logButton || 
                 e.getSource() == sqrtButton ||
                 e.getSource() == factButton) {
            
            String funcName = ((JButton)e.getSource()).getText();
            display.setText(display.getText() + funcName + "(");
            expression.append(funcName).append("(");
            parenCount++;
        }
        
        // Handle equals button
        else if (e.getSource() == equButton) {
            // Add closing parentheses if needed
            while (parenCount > 0) {
                expression.append(")");
                parenCount--;
            }
            
            // Evaluate the expression
            String expressionStr = expression.toString()
                .replace("sin(", "Math.sin(Math.toRadians(")
                .replace("cos(", "Math.cos(Math.toRadians(")
                .replace("tan(", "Math.tan(Math.toRadians(")
                .replace("log(", "Math.log10(")
                .replace("√(", "Math.sqrt(")
                .replace("^", "Math.pow(");
            
            // Handle special cases for functions that need closing parentheses
            if (expressionStr.contains("Math.pow(")) {
                expressionStr = handlePowerFunction(expressionStr);
            }
            
            try {
                // Replace factorial notation with calculation
                if (expressionStr.contains("x!")) {
                    expressionStr = handleFactorial(expressionStr);
                }
                
                // Evaluate the expression
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("js");
                Object result = engine.eval(expressionStr);
                
                if (result instanceof Number) {
                    double value = ((Number) result).doubleValue();
                    display.setText(formatResult(value));
                    
                    // Reset for new calculation
                    expression = new StringBuilder(formatResult(value));
                } else {
                    display.setText("Error");
                    expression.setLength(0);
                }
            } catch (Exception ex) {
                display.setText("Error");
                expression.setLength(0);
            }
            
            parenCount = 0;
        }
    }
    
    // Helper methods for expression evaluation
    
    private int findLastNumberStart(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (!Character.isDigit(c) && c != '.') {
                return i + 1;
            }
        }
        return 0;
    }
    
    private String handlePowerFunction(String expr) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < expr.length()) {
            if (i + 9 <= expr.length() && expr.substring(i, i + 9).equals("Math.pow(")) {
                // Find the comma to separate arguments
                int start = i + 9;
                int parenLevel = 1;
                int commaPos = -1;
                
                for (int j = start; j < expr.length() && parenLevel > 0; j++) {
                    if (expr.charAt(j) == '(') parenLevel++;
                    else if (expr.charAt(j) == ')') parenLevel--;
                    else if (expr.charAt(j) == ',' && parenLevel == 1) commaPos = j;
                }
                
                if (commaPos != -1) {
                    String arg1 = expr.substring(start, commaPos);
                    String arg2 = expr.substring(commaPos + 1, commaPos + 1 + expr.length() - commaPos - 2);
                    result.append("Math.pow(").append(arg1).append(",").append(arg2).append(")");
                    i = commaPos + 1 + arg2.length() + 1;
                } else {
                    result.append(expr.charAt(i));
                    i++;
                }
            } else {
                result.append(expr.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
    
    private String handleFactorial(String expr) {
        // This is a simplified version - a full implementation would need more complex parsing
        String result = expr.replace("x!", "factorial");
        return result;
    }
    
    // Inner class for expression evaluation
    private class ExpressionEvaluator {
        public double evaluate(String expression) {
            return evaluateExpression(expression, 0, expression.length() - 1);
        }
        
        private double evaluateExpression(String expr, int start, int end) {
            // Implementation of expression evaluation
            // For a full implementation, we would need a proper parser
            // This is a placeholder for the concept
            return 0;
        }
    }
} 