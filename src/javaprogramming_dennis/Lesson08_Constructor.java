package javaprogramming_dennis;

public class Lesson08_Constructor {

    String Team;
    int Goals;

    public Lesson08_Constructor(String Team, int Goals) {

        this.Team = Team;
        this.Goals = Goals;
    }

    public static void main(String[] args) {

        Lesson08_Constructor LC = new Lesson08_Constructor("Atletico Madrid", 2);

        System.out.println(LC.Team + " will win by " + LC.Goals + " goals");

    }

}
