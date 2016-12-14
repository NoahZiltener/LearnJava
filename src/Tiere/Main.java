package Tiere;

/**
 * Created by Noah on 14.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        Katze kater = new Katze(4, 10, 20);
        kater.miauen();
        System.out.println(kater.sprunghoehe());
        Hund Noahsdog = new Hund(4, 12, 30);
        Noahsdog.bellen();
        System.out.println(Noahsdog.sprunghoehe());
        Vogel Elster = new Vogel(2,35,10, 62);
        Elster.Zwitschern();
        System.out.println(Elster.sprunghoehe());
        System.out.println(Elster.getSpannweite());
    }
}
