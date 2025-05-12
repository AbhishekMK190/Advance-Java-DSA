import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorLauncher {
    private JFrame frame;
    private JButton basicButton, scientificButton;
    private JLabel titleLabel;
    
    public CalculatorLauncher() {
        // Setup the frame
        frame = new JFrame("Calculator Launcher");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(240, 240, 240));
        
        // Title label
        titleLabel = new JLabel("Choose Calculator Type");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(60, 40, 300, 50);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Basic calculator button
        basicButton = new JButton("Basic Calculator");
        basicButton.setFont(new Font("Arial", Font.PLAIN, 16));
        basicButton.setBounds(100, 120, 200, 40);
        basicButton.setBackground(new Color(220, 220, 220));
        basicButton.setFocusPainted(false);
        basicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Calculator();
            }
        });
        
        // Scientific calculator button
        scientificButton = new JButton("Scientific Calculator");
        scientificButton.setFont(new Font("Arial", Font.PLAIN, 16));
        scientificButton.setBounds(100, 180, 200, 40);
        scientificButton.setBackground(new Color(70, 130, 180));
        scientificButton.setForeground(Color.WHITE);
        scientificButton.setFocusPainted(false);
        scientificButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ScientificCalculator();
            }
        });
        
        // Add components to the frame
        frame.add(titleLabel);
        frame.add(basicButton);
        frame.add(scientificButton);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); // Center on screen
    }
    
    public static void main(String[] args) {
        // Set look and feel to system default
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Create launcher
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorLauncher();
            }
        });
    }
} 