package javaprogramming_dennis;

import javax.swing.JOptionPane;

public class Lesson13_Exception {

    public static void main(String[] args) {
        /* try {
            int product = Integer.parseInt(JOptionPane.showInputDialog("Enter"));
            JOptionPane.showMessageDialog(null, "Product is " + product * 0.5);
        } catch (Exception ex) {//skips the lines of code with the errors amd continues witht he rest of the code.
            System.out.println("Invalid Entry");
        }

        JOptionPane.showMessageDialog(null, "Stopped"); */
        try {
            int answer = Integer.parseInt(JOptionPane.showInputDialog("Enter Value"));
            JOptionPane.showMessageDialog(null, "Answer is " + answer / 0);

        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
