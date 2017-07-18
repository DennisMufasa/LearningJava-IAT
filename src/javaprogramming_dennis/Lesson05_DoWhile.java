package javaprogramming_dennis;

import javax.swing.JOptionPane;

public class Lesson05_DoWhile {

    public static void main(String[] args) {
        /*  do{
         }while(//condition));
            
         }
         */
        /*
         int i = 0;
         int sum = 0;
         do {
         sum += i;
         i++;
         } while (i < 10);
         System.out.println("sum is "+sum);
         */
        /*
         int i = 1;//begin when i is 1
         int sum = 0;
         do {
         sum += i;//sum is addition of all i's
         i += 2;//i increases by 2 from 1 to 3 and so on
         } while (i < 10);
         System.out.println("Sum is " + sum);
         */
    /*    
         int i=0;
         int sum=0;
         int rem=0;
        
         do {
         rem=i %2;
         if(rem==1){
         sum+=i;
         i++;
         }
         } while (i<=10);
         System.out.println("Sum is " + sum);
         */
/*
        int att = 3;
        int i = 0;
        do {
            String ans = JOptionPane.showInputDialog("Who is the player with the most tries in Rugby 7's");
            if (ans.equals("Injera")) {
                JOptionPane.showMessageDialog(null, "That is correct");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "That is wrong");
                att -= 1;
                JOptionPane.showMessageDialog(null, "Remaining with " + att + " Attempts");
            }
            i++;
        } while (i < 3);
*/
        
     
        
    }

}
