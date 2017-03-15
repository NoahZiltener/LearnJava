package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Bogenschuetze extends Ritter {
    public Bogenschuetze(int hp, int dmg, int lvl, String name ) {
        super(hp, dmg, lvl, name);
    }
@Override
public void print() {
    System.out.println("=== " + this.name + " der Bogenschütze" + " ===");
    System.out.println("Leben:" + this.hp);
    System.out.println("Schaden:" + this.dmg);
    System.out.println("Level:" + this.lvl);
}
}
