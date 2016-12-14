package Ritterspiel;

public class Main {


    public static void main(String[] args) {
        Ritter heinrich = new Ritter(100, 20, 2, "Heinrich");
        Ritter schwarzerRitter = new Ritter(120, 25, 3, "Schwarzer_Ritter");

        heinrich.hit(schwarzerRitter);
        heinrich.hit(schwarzerRitter);
        heinrich.hit(schwarzerRitter);
        heinrich.hit(schwarzerRitter);
        heinrich.hit(schwarzerRitter);
        System.out.println(schwarzerRitter.hp);

    }

}
