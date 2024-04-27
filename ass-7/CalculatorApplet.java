/*. Write java program to make a Calculator in Java Using applet. Handle appropriate event.*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CalculatorApplet extends Applet implements ActionListener {
    TextField display;
    Button[] buttons;
    String[] buttonLabels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "C", "0", "=", "+"
    };

    public void init() {
        display = new TextField(10);
        display.setEditable(false);
        add(display);

        buttons = new Button[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new Button(buttonLabels[i]);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("C")) {
            display.setText("");
        } else if (command.equals("=")) {
            String expression = display.getText();
            try {
                double result = evaluateExpression(expression);
                display.setText(Double.toString(result));
            } catch (ArithmeticException | NumberFormatException e) {
                display.setText("Error");
            }
        } else {
            display.setText(display.getText() + command);
        }
    }

    private double evaluateExpression(String expression) {
        return new Calculator().evaluate(expression);
    }

    class Calculator {
        public double evaluate(String expression) {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                }

                boolean isDigit(int charToCheck) {
                    return Character.isDigit(charToCheck);
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expression.length()) throw new NumberFormatException("Unexpected: " + (char)ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (;;) {
                        if (eat('+')) x += parseTerm();
                        else if (eat('-')) x -= parseTerm();
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (;;) {
                        if (eat('*')) x *= parseFactor();
                        else if (eat('/')) x /= parseFactor();
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor();
                    if (eat('-')) return -parseFactor();

                    double x;
                    int startPos = this.pos;
                    if ((ch >= '0' && ch <= '9') || ch == '.') {
                        while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                        x = Double.parseDouble(expression.substring(startPos, this.pos));
                    } else {
                        throw new NumberFormatException("Unexpected: " + (char)ch);
                    }
                    return x;
                }

                boolean eat(int charToEat) {
                    while (ch == ' ') nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }
            }.parse();
        }
    }
}
