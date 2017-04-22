package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Schwert extends Waffen {
    public Schwert(int dmg, int lvl, Material material, String name, int anzahlhaende, float laenge, float gewicht) {
        super(dmg, lvl, material, name); //TODO: anzahlheande, laenge und gewicht im konstruktor hinzufügen
    }
}
