//Create an applet to display a message at the center of the applet. The message is
// passed as a parameter to the applet
 import java.applet.*;
import java.awt.*;

public class MessageApplet extends Applet {
    private String message;

    public void init() {
        // Retrieve the message parameter from HTML
        message = getParameter("message");

        // Set the background color
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        // Set font and color for drawing the message
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.blue);

        // Get the size of the applet window
        int width = getSize().width;
        int height = getSize().height;

        // Get the size of the message
        FontMetrics fm = g.getFontMetrics();
        int messageWidth = fm.stringWidth(message);
        int messageHeight = fm.getHeight();

        // Calculate the position to center the message
        int x = (width - messageWidth) / 2;
        int y = (height + messageHeight) / 2;

        // Draw the message at the center of the applet
        g.drawString(message, x, y);
    }
}


<html>
<head>
    <title>Message Applet</title>
</head>
<body>
    <applet code="MessageApplet.class" width="300" height="200">
        <param name="message" value="Hello, World!">
    </applet>
</body>
</html>

