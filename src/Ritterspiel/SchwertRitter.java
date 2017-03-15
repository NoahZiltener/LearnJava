package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */

public class SchwertRitter extends Ritter {
    String leder;
    public SchwertRitter(int hp, int dmg, int lvl, String name) {
        super(hp, dmg, lvl, name);

    }

    public SchwertRitter(int hp, int dmg, int lvl, String name, Schwert schwert ) {
        super(hp, dmg, lvl, name);

    }
    @Override
    public void hit(Ritter gegner){
        gegner.hp = gegner.hp - dmg * 5;

    }
    @Override
    public void print() {
        System.out.println("=== " + this.name + " der Schwertkämpfer " + " ===");
        System.out.println("Leben:" + this.hp);
        System.out.println("Schaden:" + this.dmg);
        System.out.println("Level:" + this.lvl);
}
}
