package Ritterspiel;

public class Ritter {

    public int hp;
    public int dmg;
    public int lvl;
    public String name;
    public Ruestung ruestung;
    public Waffen waffen;


    public Ritter(int hp, int dmg, int lvl, String name) {
        this.hp = hp;
        this.dmg = dmg;
        this.lvl = lvl;
        this.name = name;
        print();
    }

    public Ritter(int hp, int dmg, int lvl, String name, Ruestung ruestung, Waffen waffen) {

        this.hp = hp;
        this.dmg = dmg;
        this.lvl = lvl;
        this.name = name;
        this.ruestung = ruestung;
        this.waffen = waffen;
        print();
    }

    public void hit(Ritter gegner) {

        dmg = this.dmg;

        if (this.waffen != null) {
            dmg += this.waffen.dmg;
        }
        if (gegner.ruestung != null) {

            dmg -= gegner.ruestung.hp;
        }
        if (dmg > 0) {
            gegner.hp -= dmg;
        }


    }

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
        System.out.println("_________________________");
    }

    public void printhit(Ritter gegner) {
        System.out.println(this.name + " sclägt " + gegner.name + " Restliche Lebenspunkte " + gegner.hp);

    }


}



