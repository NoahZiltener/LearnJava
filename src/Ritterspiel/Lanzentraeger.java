package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Lanzentraeger extends Ritter {
    public Lanzentraeger(int hp, int dmg, int lvl, String name) {
        super(hp, dmg, lvl, name);
    }

    public Lanzentraeger(int hp, int dmg, int lvl, String name, Ruestung ruestung, Lanze lanze) {
        super(hp, dmg, lvl, name, ruestung, lanze);
    }

    @Override
    public void print() {

        System.out.println("=== " + this.getName() + " der Lanzenträger " + " ===");
        super.print();
    }
}
