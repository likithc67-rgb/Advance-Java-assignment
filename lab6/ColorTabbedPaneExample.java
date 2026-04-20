package lab6;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorTabbedPaneExample {

    JFrame frame;
    JLabel label;

    ColorTabbedPaneExample() {
        frame = new JFrame("Color Tabbed Pane");

        // Label to display selected color
        label = new JLabel("Select a tab", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBounds(50, 250, 300, 30);

        // Create panels
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 300, 150);

        tabbedPane.add("Cyan", cyanPanel);
        tabbedPane.add("Magenta", magentaPanel);
        tabbedPane.add("Yellow", yellowPanel);

        // Add change listener
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(index);

                label.setText("Selected Color: " + title);
                System.out.println("Selected Color: " + title);
            }
        });

        // Add components
        frame.add(tabbedPane);
        frame.add(label);

        // Frame settings
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorTabbedPaneExample();
    }
}