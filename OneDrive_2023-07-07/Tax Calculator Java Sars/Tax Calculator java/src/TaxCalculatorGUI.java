import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaxCalculatorGUI extends JFrame implements ActionListener {
    private JTextField incomeField;
    private JLabel taxAmountLabel;

    public TaxCalculatorGUI() {
        setTitle("Tax Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
//        getBackground(setBackground(Color.pink)
//                ;);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 2));

        JLabel incomeLabel = new JLabel("Income (ZAR):");
        incomeField = new JTextField();
        JLabel taxRateLabel = new JLabel("Tax Rate (%):");
        JLabel taxRateValueLabel = new JLabel(" "); // South African tax rate example
        JLabel taxAmountTitleLabel = new JLabel("Tax Amount:        R");
        taxAmountLabel = new JLabel();

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        mainPanel.add(incomeLabel);
        mainPanel.add(incomeField);
        mainPanel.add(taxRateLabel);
        mainPanel.add(taxRateValueLabel);
        mainPanel.add(taxAmountTitleLabel);
        mainPanel.add(taxAmountLabel);

        add(mainPanel, BorderLayout.CENTER);
        add(calculateButton, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        double income = Double.parseDouble(incomeField.getText());
        double taxRate = 0.18; // South African tax rate example
        double taxAmount = income * taxRate;
        taxAmountLabel.setText(Double.toString(taxAmount));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TaxCalculatorGUI taxCalculatorGUI = new TaxCalculatorGUI();
            taxCalculatorGUI.setVisible(true);
        });
    }
}