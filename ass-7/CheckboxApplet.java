/*
1. Design following applet in Java and add checkbox event and display appropriate messages 
using label
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxApplet extends Applet implements ItemListener {
    private Checkbox option1Checkbox, option2Checkbox;
    private Label messageLabel;

    public void init() {
        setLayout(new FlowLayout());

        // Create checkboxes
        option1Checkbox = new Checkbox("Option 1");
        option2Checkbox = new Checkbox("Option 2");

        // Add item listeners to checkboxes
        option1Checkbox.addItemListener(this);
        option2Checkbox.addItemListener(this);

        // Create label for displaying messages
        messageLabel = new Label("");

        // Add components to the applet
        add(option1Checkbox);
        add(option2Checkbox);
        add(messageLabel);
    }

    public void itemStateChanged(ItemEvent e) {
        Checkbox selectedCheckbox = (Checkbox) e.getItem();
        String message = "";

        // Check which checkbox is selected and set the message accordingly
        if (selectedCheckbox == option1Checkbox && selectedCheckbox.getState()) {
            message = "Option 1 selected";
        } else if (selectedCheckbox == option2Checkbox && selectedCheckbox.getState()) {
            message = "Option 2 selected";
        }

        // Display the message in the label
        messageLabel.setText(message);
    }
}

