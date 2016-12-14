package Tiere;

/**
 * Created by Noah on 14.12.2016.
 */
public class Hund extends Tier {

    public Hund(int beine, int geschwindikeit, int groesse) {
        super(beine, geschwindikeit, groesse);

    }

    public void bellen(){

        System.out.println("Wufff");
    }
}
