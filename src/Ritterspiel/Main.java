package Ritterspiel;

public class Main {


    public static void main(String[] args) {
        SchwertRitter heinrich = new SchwertRitter(120, 20, 2, "Heinrich");

        SchwertRitter schwarzerRitter = new SchwertRitter(120, 25, 3, "Schwarzer_Ritter");

        SchwertRitter ernst = new SchwertRitter(100, 10, 3, "Ernst");

        SchwertRitter max = new SchwertRitter(150, 19, 2, "Max");

        Lanzentraeger jan = new Lanzentraeger(100, 10, 1, "Jan");

        Waffen dolch = new Waffen(100, 1, "Holz", "Dolch");

        Material Holz = new Material("Holz");

        Ruestung eisenHelm = new Ruestung(20, 2, "EisenHelm", "Eisen");

        heinrich.ruestung = eisenHelm;
        jan.waffen = dolch;


        //ernst.printhit(schwarzerRitter);


       // max.printhit(ernst);


        //heinrich.printhit(schwarzerRitter);


        //schwarzerRitter.printhit(jan);

        jan.hit(heinrich);
        jan.printhit(heinrich);




        schwarzerRitter.print();
        heinrich.print();
        ernst.print();
        ernst.printhit(schwarzerRitter);
        max.print();
        jan.print();
        System.out.println(Holz.material);
        System.out.println(eisenHelm.name);


    }

}
