package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Bogenschuetze extends Ritter {
    public Bogenschuetze(int hp, int dmg, int lvl, String name) {
        super(hp, dmg, lvl, name);
    }

    @Override
    public void print() {
        System.out.println("=== " + this.getName() + " der Bogenschuetze " + " ===");
    super.print();
    }
}
