package javaprogramming_dennis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lesson11_GUI {

    JFrame frame;
    JPanel panel;
    JLabel lbl;
    JTextField txt;
    JButton btn;
    JComboBox cmb;

    public Lesson11_GUI() {

        lbl = new JLabel("Enter your pin number");
        txt = new JTextField(20);
        String[] Gender = {"Male", "Female"};
        cmb = new JComboBox(Gender);
        btn = new JButton("OK");
        Lesson11_Inner L11 = new Lesson11_Inner();
        btn.addActionListener(L11);

        panel = new JPanel();
        frame = new JFrame("JAVA GUI");

        panel.add(lbl);
        panel.add(txt);
        panel.add(btn);
        panel.add(cmb);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        Lesson11_GUI L11 = new Lesson11_GUI();

    }

    class Lesson11_Inner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent userAction) {
            if (userAction.getActionCommand().equals("OK")) {
                
                String n= txt.getText();
                
                JOptionPane.showMessageDialog(null,n);

            }//else if (userAction.getActionCommand().equals("")){JOptionPane" " "

        }

    }

}
