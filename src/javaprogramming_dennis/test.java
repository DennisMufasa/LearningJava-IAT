
package javaprogramming_dennis;

import java.util.Scanner;


public class test {
    public static void main(String[] args) {
     
          Scanner input= new Scanner(System.in);
        System.out.println("Kindly enter your name");
        String name;
        name=input.next();
        System.out.println("Enter Shoe Size");
        int ShoeSize;
        ShoeSize=input.nextInt();
        System.out.println("Your name is " +name +" I waer shoe number "+ShoeSize);
 
}
}
