package javaprogramming_dennis;

public class Lesson09_Inheritance {

    String model;
    int price;

    public Lesson09_Inheritance(String model, int price) {
        this.model = model;
        this.price = price;

    }

    public void setProperties(String m, int p) {

        model = m;
        price = p;

    }

    public int returnprice() {
        return price;
    }

    public String retunmodel() {
        return model;
    }

    public static void main(String[] args) {

        Lesson09_Inner L9 = new Lesson09_Inner("Samsung galaxy grand 2", 4000);
        //  L9.setProperties("Samsung Galaxy Grand 2", 4000);
        L9.Echomodel();
    }

    static class Lesson09_Inner extends Lesson09_Inheritance {

        public Lesson09_Inner(String m, int p) {
            super(m, p);//accessing the constructor of the parentclass from the child class.
        }

        public void Echomodel() {
            System.out.println(super.model + " will cost Ksh " + super.price);
        }


     /*  @Override
        public void setProperties(String m, int p) {

            System.out.println(m + "Model will cost" + p);

        }*/

    }

}
