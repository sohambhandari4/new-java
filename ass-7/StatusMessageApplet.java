//.Create an applet to set Status Message in Applet Window like
import java.applet.*;
import java.awt.*;

public class StatusMessageApplet extends Applet {
    private String statusMessage;

    public void init() {
        // Initialize the status message
        statusMessage = "Ready";

        // Set the background color
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        // Draw the status message at the bottom of the applet window
        g.setColor(Color.black);
        g.drawString(statusMessage, 10, getSize().height - 10);
    }

    // Set the status message
    public void setStatusMessage(String message) {
        statusMessage = message;
        repaint(); // Redraw the applet window to display the new status message
    }
}



<html>
<head>
    <title>Status Message Applet</title>
</head>
<body>
    <applet code="StatusMessageApplet.class" width="300" height="200" id="applet">
        <!-- The applet is embedded here -->
    </applet>

    <script>
        // Get a reference to the applet
        var applet = document.getElementById('applet');

        // Set a status message
        applet.setStatusMessage("Loading...");

        // Simulate a delay before changing the status message
        setTimeout(function() {
            applet.setStatusMessage("Ready");
        }, 3000); // Change the status message after 3 seconds
    </script>
</body>
</html>
