package javaprogramming_dennis;

import javax.swing.JOptionPane;

public class Lesson05_ForExt {

    public static void main(String[] args) {
        for (;;) {
            String input = JOptionPane.showInputDialog("type a letter");
            if (input.equals("q")) {
                break;// ends the loopprematurely
            } else {
                System.out.println(input);
                continue;// skips the current condition and evaluate the next
            }
        }

    }
}
