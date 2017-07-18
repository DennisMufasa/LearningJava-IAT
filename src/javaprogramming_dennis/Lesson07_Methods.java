package javaprogramming_dennis;

import javax.swing.JOptionPane;

public class Lesson07_Methods {

    public static void main(String[] args) {
       // Mentor("Harrison Wells", "critical thinking");

        int sales = Integer.parseInt(JOptionPane.showInputDialog("Enter the sales"));

        String city = JOptionPane.showInputDialog("Enter the city");

        commission(sales, city);
    }

    /*syntax
     <access-modifier> <[Static]> <Return-type> < Name>\
     ({Optional]){
     //
     }
     */
    public static void Mentor(String n, String c) {
        // System.out.println("My mentor is " + n + ". I admire his " + c);

    }


     public static void commission(int sales, String city) {

     if (sales >= 10000 && city.equals("Nairobi")) {
     System.out.println("commission= " + (sales * 0.01));
     } else if (sales >= 10000 && city.equals("Others")) {
     System.out.println("commission= " + (sales * 0.015));

     } else if (sales <= 9999 && city.equals("Nairobi")) {
     System.out.println("commission= " + (sales * 0.005));

     } else if (sales <= 9999 && city.equals("Nairobi")) {
     System.out.println("commission= " + (sales * 0.008));
     }

     }
     }

