package javaprogramming_dennis;

public class Lesson06_2DArrays {

    public static void main(String[] args) {

        int[][] No;
        No = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                No[i][j] = j;
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(No[i][j]);
            }
            System.out.println("|");
        }

    }

}
