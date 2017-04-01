package Ritterspiel;

public class Main {


    public static void main(String[] args) {

        //Materialien

        Material holz = new Material("Holz", 1, "braun");

        Material eisen = new Material("Eisen", 4, "grau");

        Material diamant = new Material("Diamant", 3, "balu");

        Material gold = new Material("Gold", 5, "gelb");

        Material adamant = new Material("Adamant",2,"grau");

        Material obsidian = new Material("Obsidian", 10, "schwarz");

        //Waffen & Rüstungen

        Waffen dolch = new Waffen(100, 1, holz, "Dolch");

        Schwert langschwert = new Schwert(200, 4, obsidian, "Langschwert", 2, 2, 10);

        Ruestung eisenHelm = new Ruestung(20, 2, "EisenHelm", eisen);

        //Ritter

        SchwertRitter heinrich = new SchwertRitter(120, 20, 2, "Heinrich");

        SchwertRitter schwarzerRitter = new SchwertRitter(120, 25, 3, "Schwarzer_Ritter");

        SchwertRitter ernst = new SchwertRitter(100, 10, 3, "Ernst");

        SchwertRitter max = new SchwertRitter(150, 19, 2, "Max");

        Lanzentraeger jan = new Lanzentraeger(50, 10, 1, "Jan");









        heinrich.setRuestung(eisenHelm);
        jan.setWaffen(dolch);
        max.setWaffen(langschwert);


        //ernst.printhit(schwarzerRitter);


       // max.printhit(ernst);


        //heinrich.printhit(schwarzerRitter);


        //schwarzerRitter.printhit(jan);

        jan.hit(heinrich);
        jan.printhit(heinrich);
        max.hit(jan);




        schwarzerRitter.print();
        heinrich.print();
        ernst.print();
        ernst.printhit(schwarzerRitter);
        max.print();
        jan.print();
        System.out.println(holz.getMaterial());
        System.out.println(eisenHelm.name);


    }

}
