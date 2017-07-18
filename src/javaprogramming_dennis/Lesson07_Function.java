package javaprogramming_dennis;

public class Lesson07_Function {

    public static void main(String[] args) {
        String n= Mentor();
         System.out.println("My Mentor is "+n);

         }


        public static  String Mentor(){
         return "Adams";
    
         }
        /*
        int[] n = {10, 45, 200, 70, 14, 30};
        int Largest = Max(n);
        System.out.println(Largest);

    }

    static int Max(int[] MyArray) {
        int theMax = MyArray[0];
        for (int i = 0; i < MyArray.length; i++) {
            if (MyArray[i] > theMax) {
                theMax = MyArray[i];
            } else {
                theMax = theMax;
            }
        }
        return theMax;
    }*/
}
