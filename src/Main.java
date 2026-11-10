import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        // Setup main window
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(400, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());

        int sum = 0;

        // Top panel: Show result
        JLabel display = new JLabel("0");
        display.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 5));
        display.setFont(new Font("Arial", Font.PLAIN, 40));
        display.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        mainFrame.add(display, BorderLayout.NORTH);

        // Center panel: Erase, AC, %, Buttons 0-9, and operator buttons
        JPanel centerPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JButton eraseButton = new JButton("Erase");
        eraseButton.addActionListener(e -> {
            String currentText = display.getText();
            if(currentText.length() > 1) {
                display.setText(currentText.substring(0, currentText.length() - 1));
            } else {
                display.setText("0");
            }
        });
        centerPanel.add(eraseButton);

        JButton acButton = new JButton("AC");
        acButton.addActionListener(e -> {
            display.setText("0");
        });
        centerPanel.add(acButton);

        JButton percentButton = new JButton("Percent");
        percentButton.addActionListener(e -> {
            display.setText("0");
        });
        centerPanel.add(percentButton);

        JButton divideButton = new JButton("Divide");
        divideButton.addActionListener(e -> {
            display.setText("0");
        });
        centerPanel.add(divideButton);

        JButton button7 = new JButton("7");
        button7.addActionListener(e -> {
            String currentText = display.getText();
            if(currentText.equals("0")) {
                display.setText("7");
            } else {
                display.setText(currentText + "7");
            }
        });
        centerPanel.add(button7);

        JButton button8 = new JButton("8");
        button8.addActionListener(e -> {
            String currentText = display.getText();
            if(currentText.equals("0")) {
                display.setText("0");
            } else  {
                display.setText(currentText + "8");
            }
        });
        centerPanel.add(button8);

        JButton button9 = new JButton("9");
        button9.addActionListener(e -> {
            String currentText = display.getText();
            if(currentText.equals("0")) {
                display.setText("0");
            }  else {
                display.setText(currentText + "9");
            }
        });
        centerPanel.add(button9);

        centerPanel.add(new JButton("X"));
        centerPanel.add(new JButton("4"));
        centerPanel.add(new JButton("5"));
        centerPanel.add(new JButton("6"));
        centerPanel.add(new JButton("-"));
        centerPanel.add(new JButton("1"));
        centerPanel.add(new JButton("2"));
        centerPanel.add(new JButton("3"));
        centerPanel.add(new JButton("+"));
        centerPanel.add(new JButton("+/-"));
        centerPanel.add(new JButton("0"));
        centerPanel.add(new JButton(","));
        centerPanel.add(new JButton("="));

        mainFrame.add(centerPanel, BorderLayout.CENTER);

        // Make window visible
        mainFrame.setVisible(true);
    }
}
