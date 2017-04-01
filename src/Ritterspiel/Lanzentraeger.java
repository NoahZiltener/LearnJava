package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Lanzentraeger extends Ritter {
    public Lanzentraeger(int hp, int dmg, int lvl, String name) {
        super(hp, dmg, lvl, name);
    }

    public Lanzentraeger(int hp, int dmg, int lvl, String name, String lederruestung, String lanze) {
        super(hp, dmg, lvl, name);
    }



    @Override
    public void print() {


        System.out.println("=== " + this.name + " der Lanzenträger " + " ===");
        System.out.println("Leben:" + this.hp);
        System.out.println("Schaden:" + this.dmg);
        System.out.println("Level:" + this.lvl);
        if (this.ruestung == null) {
            System.out.println("Keine Rüstung");
        } else {

            System.out.println("Rüstung:" + this.ruestung.name);

        }
        if (this.waffen == null){

            System.out.println("Keine Waffe");
        }
        else{
            System.out.println("Waffe:" + this.waffen.name);
        }
        System.out.println("_________________________");
    }
}
