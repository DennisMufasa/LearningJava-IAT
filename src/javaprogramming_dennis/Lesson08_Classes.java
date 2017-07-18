package javaprogramming_dennis;

public class Lesson08_Classes {

    public static void main(String[] args) {

        Lesson08_InnerClass IC = new Lesson08_InnerClass();

        IC.name = "Dennis";

        IC.SayMyName();

        Lesson07_Function L7 = new Lesson07_Function();

        String n=L7.Mentor();

        System.out.println(n);

    }

    static class Lesson08_InnerClass {

        private String name;//name is green since it is a class variable

        void SayMyName() {

            System.out.println(name);

        }
    }
}
