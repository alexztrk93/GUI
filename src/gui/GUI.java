package gui;
/**https://introcs.cs.princeton.edu/java/15inout/GUI.java.html*/
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {

        frame = new JFrame();/**frame*/

        panel = new JPanel();/**panel*/
        label = new JLabel("Number of Clicks: 0");
        JButton button = new JButton("Enter");/**button*/

        button.addActionListener(this);

        panel.add(label);/** add label to panel*/
        panel.add(button);/**Add button to panel*/
        panel.setBorder(BorderFactory.createBevelBorder(5));/**panel*/
        panel.setLayout(new GridLayout());/**panel*/
        frame.add(panel, BorderLayout.CENTER);/**panel*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/**panel*/
        frame.setTitle("Welcome!!!");/**panel*/
        frame.pack();/**panel*/
        frame.setVisible(true);/**panel*/


    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number Of Clicks "+count);
    }
}