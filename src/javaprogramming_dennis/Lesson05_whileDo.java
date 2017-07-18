package javaprogramming_dennis;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lesson05_whileDo {

    public static void main(String[] args) {

        /*
         Random r = new Random();
         int i = 0;
         while (i < 5) {
         int num = Integer.parseInt(JOptionPane.showInputDialog("Enter your lotto number"));
         int systno = r.nextInt(10);
         if (num == systno) {
         JOptionPane.showMessageDialog(null, "Congructulations you have won !!!");
         break;
         } else {
         JOptionPane.showMessageDialog(null, "Sorry the winning number is " + systno);
         }
         i++;

         }
        */
        
        int qtn = 5;
        int correctAns = 0;
        long start = System.currentTimeMillis();
        int count = 0;
        Random r = new Random();
        while (count <= qtn) {
            int q1 = r.nextInt(10);
            int q2 = r.nextInt(10);

            int ans = Integer.parseInt(JOptionPane.showInputDialog(q1 + " + " + q2 + "=?"));
            if (q1 + q2 == ans) {
                JOptionPane.showMessageDialog(null, "That answer is correct");
                correctAns += 1;
            } else {
                JOptionPane.showMessageDialog(null, "That answeriswrong");

            }
            count++;
        }

        long end = System.currentTimeMillis();
        long time = (end - start) / 1000;
        if (time > 15) {

            JOptionPane.showMessageDialog(null, "You got " + correctAns + " but failed on time " + time + " seconds");
        } else {

            JOptionPane.showMessageDialog(null, "You got " + correctAns + " in goodtime of " + time + " seconds");
        }
    }
}
