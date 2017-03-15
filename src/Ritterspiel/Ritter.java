package Ritterspiel;

public class Ritter {

    public int hp;
    public int dmg;
    public int lvl;
    public String name;
    public String ruestung;


    public Ritter(int hp, int dmg, int lvl, String name) {
        this.hp = hp;
        this.dmg = dmg;
        this.lvl = lvl;
        this.name = name;
        print();
    }

    public Ritter(int hp, int dmg, int lvl, String name, String ruestung) {

        this.hp = hp;
        this.dmg = dmg;
        this.lvl = lvl;
        this.name = name;
        this.ruestung = ruestung;
        print();
    }

    public void hit(Ritter gegner){

        gegner.hp = gegner.hp - dmg;


    }
    public void print() {
        System.out.println("=== " + this.name + " ===");
        System.out.println("Leben:" + this.hp);
        System.out.println("Schaden:" + this.dmg);
        System.out.println("Level:" + this.lvl);
    }
    public void printhit(Ritter gegner){
        System.out.println(this.name + " sclägt " + gegner.name + " Restliche Lebenspunkte " + gegner.hp );

        }



    }



