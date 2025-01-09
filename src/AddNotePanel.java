package src;

import javax.swing.*;
import java.awt.*;

public class AddNotePanel extends JPanel {
    public AddNotePanel(JPanel cardPanel) {
        setLayout(new BorderLayout());

        JTextArea noteTextArea = new JTextArea();
        add(new JScrollPane(noteTextArea), BorderLayout.CENTER);

        JButton saveButton = new JButton("Save");
        add(saveButton, BorderLayout.SOUTH);

        // Add ActionListener to the save button to switch back to the main panel
        saveButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) (cardPanel.getLayout());
            cl.show(cardPanel, "MainPanel");
        });
    }
}