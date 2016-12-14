package Tiere;

/**
 * Created by Noah on 14.12.2016.
 */
public class Vogel extends Tier {
    private int spannweite;

    public int getSpannweite() {
        return spannweite;
    }

    public Vogel(int beine, int geschwindikeit, int groesse, int spannweite) {
        super(beine, geschwindikeit, groesse);
        this.spannweite = spannweite;
    }

    public void Zwitschern() {

        System.out.println("Zwitscher");
    }
}
