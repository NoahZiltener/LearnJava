package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */

public class SchwertRitter extends Ritter {

    public SchwertRitter(int hp, int dmg, int lvl, String name, Ruestung ruestung, Schwert schwert) {
        super(hp, dmg, lvl, name, ruestung, schwert);
    }

    @Override
    public void print() {
        System.out.println("=== " + this.getName() + " der Schwert Ritter " + " ===");
    super.print();
    }
}
