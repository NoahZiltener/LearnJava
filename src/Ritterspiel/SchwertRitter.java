package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */

public class SchwertRitter extends Ritter {
    String leder;

    public SchwertRitter(int hp, int dmg, int lvl, String name) {
        super(hp, dmg, lvl, name);

    }

    public SchwertRitter(int hp, int dmg, int lvl, String name, Schwert schwert) {
        super(hp, dmg, lvl, name);

    }



    @Override
    public void print() {
        System.out.println("=== " + this.getName() + " der Schwert Ritter " + " ===");
    super.print();
    }
}
