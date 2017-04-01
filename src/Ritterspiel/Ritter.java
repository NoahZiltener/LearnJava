package Ritterspiel;

public class Ritter {

    private int hp;
    private int dmg;
    private int lvl;
    private String name;
    private Ruestung ruestung;
    private Waffen waffen;


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
        if (gegner.getRuestung() != null) {

            dmg -= gegner.getRuestung().hp;
        }
        if (dmg > 0) {
            gegner.setHp(gegner.getHp()- dmg);
        }


    }

    public void print() {

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

    public void printhit(Ritter gegner) {
        System.out.println(this.name + " sclägt " + gegner.name + " Restliche Lebenspunkte " + gegner.hp);

    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public int getLvl() {
        return lvl;
    }

    public String getName() {
        return name;
    }

    public Ruestung getRuestung() {
        return ruestung;
    }

    public Waffen getWaffen() {
        return waffen;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRuestung(Ruestung ruestung) {
        this.ruestung = ruestung;
    }

    public void setWaffen(Waffen waffen) {
        this.waffen = waffen;
    }
}



