package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Fernkampfwaffe extends Waffen {
    public int reichweite;
    public float gewicht;

    public Fernkampfwaffe(int dmg, int lvl, Material material, String name, int reichweite, float gewicht) {
        super(dmg, lvl, material, name);

        this.reichweite = reichweite;
        this.gewicht = gewicht;

    }
}
