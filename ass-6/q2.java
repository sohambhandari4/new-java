import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField displayField;
    private JButton[] buttons;

    private SimpleCalculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        buttons = new JButton[16];

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculator::new);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "=":
                calculate();
                break;
            default:
                displayField.setText(displayField.getText() + command);
                break;
        }
    }

    private void calculate() {
        String expression = displayField.getText();
        try {
            // Using eval() method to evaluate the expression
            Object result = new ScriptEngineManager().getEngineByName("JavaScript").eval(expression);
            displayField.setText(result.toString());
        } catch (ScriptException e) {
            JOptionPane.showMessageDialog(this, "Invalid expression", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
