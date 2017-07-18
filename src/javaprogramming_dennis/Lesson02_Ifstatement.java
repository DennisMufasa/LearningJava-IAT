package javaprogramming_dennis;

import javax.swing.JOptionPane;

public class Lesson02_Ifstatement {

    public static void main(String[] args) {
        /*
         String CEO = JOptionPane.showInputDialog("Who is your favourite CEO\n 1. Bob Collymore\n 2. James Mwangi\n 3. Oigara");
         if (CEO.equals("Bob Collymore")) {
         System.out.println(CEO + " is the CEO of Safaricom");
         } else if (CEO.equals("James Mwangi")) {
         System.out.println(CEO + "is the CEO of Equity BAnk");
         } else if (CEO.equals("Oigara")) {
         System.out.println(CEO + "is the CEO of KCB Group");
         } else {
         System.out.println(CEO + " Invalid CEO");

         }
         */

        /*
        
         int MathreeRoute = Integer.parseInt(JOptionPane.showInputDialog("What is your Mathree route number"));
         if (MathreeRoute == 11 || MathreeRoute== 12) {
         JOptionPane.showMessageDialog(null, MathreeRoute + " Goes to South B");
         } else if (MathreeRoute == 19) {
         JOptionPane.showMessageDialog(null, MathreeRoute + " Goes to Kayole");
         } else if (MathreeRoute == 105) {
         JOptionPane.showMessageDialog(null, MathreeRoute + " Goes to KIkuyu");
         } else if (MathreeRoute == 23) {
         JOptionPane.showMessageDialog(null, MathreeRoute + " Goes to Kangemi");
         } else if (MathreeRoute == 17) {
         JOptionPane.showMessageDialog(null, MathreeRoute + " Goes to Kangemi");
         } else {
         System.out.println("Invalid Route Numver" + MathreeRoute);

         }
         */
        /*
        

         int Points = Integer.parseInt(JOptionPane.showInputDialog("how many Points do you want to buy"));
         if (Points == 10) {
         JOptionPane.showMessageDialog(null, Points + " Points" + " costs Ksh2");
         } else if (Points == 25) {
         JOptionPane.showMessageDialog(null, Points + " Points" + " costs Ksh5");
         } else if (Points == 50) {
         JOptionPane.showMessageDialog(null, Points + " Points" + " costs Ksh10");
         } else if (Points == 100) {
         JOptionPane.showMessageDialog(null, Points + " Points" + " costs Ksh20");
         } else {
         System.out.println(Points + " Invalid Points");
         }
         */
       
        
        int Reply = Integer.parseInt(JOptionPane.showInputDialog("Please Reply with" + "\n 1.10 Points for Ksh 2 \n 2. 25 Poits for Ksh 5 \n 3. 50 points for Ksh 10 \n 4. 100 Points for Ksh 20"));
        if (Reply == 1) {
            JOptionPane.showMessageDialog(null, "You have successfully redeemed 10 points for Ksh 2");
        } else if (Reply == 2) {
            JOptionPane.showMessageDialog(null, "You have successfully redeemed 25 points for Ksh 5");
        } else if (Reply == 3) {
            JOptionPane.showMessageDialog(null, "You have successfully redeemed 50 points for Ksh 10");
        } else if (Reply == 4) {
            JOptionPane.showMessageDialog(null, "You have successfully redeemed 100 points for Ksh 20");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Reply");
        }

    }
}
