package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Fernkampfwaffe extends Waffen {
    public int reichweite;
    public float gewicht;
    public Fernkampfwaffe(int dmg, int lvl, String material, int reichweite, float gewicht) {
        super(dmg, lvl, material);

        this.reichweite = reichweite;
        this.gewicht = gewicht;

    }
}
