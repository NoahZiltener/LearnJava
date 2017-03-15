package Ritterspiel;

public class Main {


    public static void main(String[] args) {
        SchwertRitter heinrich = new SchwertRitter(100, 20, 2, "Heinrich");

        SchwertRitter schwarzerRitter = new SchwertRitter(120, 25, 3, "Schwarzer_Ritter");

        SchwertRitter ernst = new SchwertRitter(  100,  10,  3, "Ernst");

        SchwertRitter max = new SchwertRitter(  150,  19,  2, "Max");

        Lanzentraeger jan = new Lanzentraeger( 100, 25, 1, "Jan");

        Waffen dolch =new Waffen( 10, 1, "Holz");

        Material Holz = new Material( "Holz");

        ernst.hit(schwarzerRitter);
        ernst.printhit(schwarzerRitter);

        max.hit(ernst);
        max.printhit(ernst);

        heinrich.hit(schwarzerRitter);
        heinrich.printhit(schwarzerRitter);

        schwarzerRitter.hit(jan);
        schwarzerRitter.printhit(jan);

        jan.hit(heinrich);
        jan.printhit(heinrich);





        schwarzerRitter.print();
        heinrich.print();
        ernst.print();
        ernst.printhit(schwarzerRitter);
        max.print();
        jan.print();
        System.out.println(Holz.material);





    }

}
