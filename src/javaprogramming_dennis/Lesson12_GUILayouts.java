package javaprogramming_dennis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.*;

public class Lesson12_GUILayouts {

    JFrame frame;
    JPanel panel, panel1, panel2;
    JLabel lblTitle, lblUser, lblPass;
    JTextField txtUser, txtPass;
    JComboBox cbo;
    JButton btnok, btncancel;

    public Lesson12_GUILayouts() {

        lblTitle = new JLabel("Login Form");
        lblUser = new JLabel("UserName");
        lblPass = new JLabel("Password");
        String[] logas = {"User", "Admin"};
        cbo = new JComboBox(logas);

        txtUser = new JTextField(25);
        txtPass = new JTextField(25);

        btnok = new JButton("Login");
        btncancel = new JButton("Cancel");

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));// this panel is for the title.
        panel.add(lblTitle);

        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());// this panel is for the other components.

        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(5, 5, 5, 5);//puts spaces of 5 between all the components in the panel

        c.gridx = 0;//this is at the very center
        c.gridy = 0;//"    "    "
        panel1.add(lblUser, c);

        c.gridx = 2;
        c.gridy = 0;
        panel1.add(txtUser, c);

        c.gridx = 0;
        c.gridy = 2;

        panel1.add(lblPass, c);
        c.gridx = 2;
        c.gridy = 2;
        panel1.add(txtPass, c);
        c.gridx = 2;
        c.gridy = 4;
        panel1.add(cbo, c);
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 2));//this panelis for the buttons.
        panel2.add(btnok);
        panel2.add(btncancel);

        frame = new JFrame("Login Application");
        frame.add(BorderLayout.CENTER, panel1);
        frame.add(BorderLayout.NORTH, panel);
        frame.add(BorderLayout.SOUTH, panel2);

        frame.setSize(500, 500);
        frame.setVisible(true);
        //will close when click on x
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //center's the frame
        frame.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {

        Lesson12_GUILayouts GL = new Lesson12_GUILayouts();
    }
}
