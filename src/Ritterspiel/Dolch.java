package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Dolch extends Waffen {

    private int laenge;
    private float gewicht;

    public Dolch(int dmg, int lvl, Material material, String name, int laenge, float gewicht) {
        super(dmg, lvl, material, name);

        this.laenge = laenge;
        this.gewicht = gewicht;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }
}
