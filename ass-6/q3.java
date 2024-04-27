import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontSelector extends JFrame implements ActionListener {
    private JLabel sampleTextLabel;
    private JComboBox<String> fontComboBox;
    private JComboBox<Integer> sizeComboBox;
    private JCheckBox boldCheckBox, italicCheckBox;

    private FontSelector() {
        setTitle("Font Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());

        // Font Selection
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontComboBox = new JComboBox<>(fontNames);
        fontComboBox.addActionListener(this);
        topPanel.add(fontComboBox);

        // Font Size Selection
        Integer[] sizes = {10, 12, 14, 16, 18, 20, 22, 24};
        sizeComboBox = new JComboBox<>(sizes);
        sizeComboBox.addActionListener(this);
        topPanel.add(sizeComboBox);

        add(topPanel, BorderLayout.NORTH);

        // Sample Text Label
        sampleTextLabel = new JLabel("Sample Text");
        sampleTextLabel.setHorizontalAlignment(JLabel.CENTER);
        sampleTextLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        add(sampleTextLabel, BorderLayout.CENTER);

        // Style Selection
        JPanel stylePanel = new JPanel(new FlowLayout());
        boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.addActionListener(this);
        stylePanel.add(boldCheckBox);

        italicCheckBox = new JCheckBox("Italic");
        italicCheckBox.addActionListener(this);
        stylePanel.add(italicCheckBox);

        add(stylePanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FontSelector::new);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateFont();
    }

    private void updateFont() {
        String selectedFont = (String) fontComboBox.getSelectedItem();
        int selectedSize = (int) sizeComboBox.getSelectedItem();
        int style = Font.PLAIN;

        if (boldCheckBox.isSelected()) {
            style |= Font.BOLD;
        }
        if (italicCheckBox.isSelected()) {
            style |= Font.ITALIC;
        }

        Font font = new Font(selectedFont, style, selectedSize);
        sampleTextLabel.setFont(font);
    }
}
