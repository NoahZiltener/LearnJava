package Tiere;

/**
 * Created by Noah on 14.12.2016.
 */
public class Tier {
    private int beine;
    private int geschwindikeit;
    private int groesse;

    public int getGroesse() {
        return groesse;
    }

    public Tier(int beine, int geschwindikeit, int groesse) {
        this.beine = beine;
        this.geschwindikeit = geschwindikeit;
        this.groesse = groesse;
    }

    public int sprunghoehe() {
        return geschwindikeit * beine;
    }
}
