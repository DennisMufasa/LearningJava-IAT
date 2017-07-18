package javaprogramming_dennis;

import javax.swing.JOptionPane;

public class Lesson06_Arrays {

    public static void main(String[] args) {
        /*syntax:1.data type[] array name;
         2 ArrayName=new datatype[n];
         */
        
         String[]Parastatals;// declare
         Parastatals=new String[5];//set the size
         Parastatals[0]="KPLC";//assigning
         Parastatals[1]="RVR";
         Parastatals[2]="Posta";
         Parastatals[3]="KRA";
         Parastatals[4]="NSSF";
        
         for (int i = 0; i < 5; i++) {
         System.out.println(Parastatals[i]);
         }
         

        int[] No;
        No = new int[3];

        for (int i = 0; i < 3; i++) {
            No[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number"));

            System.out.println(No[i]);
        }

    }
}
