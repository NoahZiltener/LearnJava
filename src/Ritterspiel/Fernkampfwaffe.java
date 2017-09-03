package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Fernkampfwaffe extends Waffen {
    private int reichweite;
    private float gewicht;

    public Fernkampfwaffe(int dmg, int lvl, Material material, String name, int reichweite, float gewicht) {
        super(dmg, lvl, material, name);

        this.setReichweite(reichweite);
        this.setGewicht(gewicht);
    }

    public int getReichweite() {
        return reichweite;
    }

    public void setReichweite(int reichweite) {
        this.reichweite = reichweite;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }
}
