package lab5;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageButtonExample {
    JLabel label;

    ImageButtonExample() {
        JFrame frame = new JFrame("Image Button Example");

        // Label to display message
        label = new JLabel();
        label.setBounds(50, 50, 400, 50);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Load images (make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");       // Digital Clock image
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png"); // Hour Glass image

        // Create buttons with images
        JButton btnClock = new JButton(clockIcon);
        JButton btnHourGlass = new JButton(hourGlassIcon);

        // Set button positions
        btnClock.setBounds(50, 120, 150, 150);
        btnHourGlass.setBounds(220, 120, 150, 150);

        // Add action listener for Clock button
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Add action listener for Hour Glass button
        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        // Frame settings
        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}