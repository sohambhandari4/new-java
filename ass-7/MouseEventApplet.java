/*.Design applet in Java to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICK 
and display the position of the Mouse_Click in a TextField.
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventApplet extends Applet implements MouseMotionListener, MouseListener {
    private TextField positionTextField;

    public void init() {
        setLayout(new FlowLayout());

        // Create TextField to display mouse position
        positionTextField = new TextField(20);

        // Add MouseMotionListener and MouseListener to the applet
        addMouseMotionListener(this);
        addMouseListener(this);

        // Add TextField to the applet
        add(positionTextField);
    }

    // MouseMotionListener methods
    public void mouseMoved(MouseEvent e) {
        // Display mouse position when moved
        positionTextField.setText("Mouse Position: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseDragged(MouseEvent e) {
        // Not used in this example
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        // Display mouse click position when clicked
        positionTextField.setText("Mouse Click Position: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        // Not used in this example
    }

    public void mouseReleased(MouseEvent e) {
        // Not used in this example
    }

    public void mouseEntered(MouseEvent e) {
        // Not used in this example
    }

    public void mouseExited(MouseEvent e) {
        // Not used in this example
    }
}

