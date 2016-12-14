package Ritterspiel;

public class Ritter {

    public int hp;
    public int dmg;
    private int lvl;
    private String name;


    public Ritter(int hp, int dmg, int lvl, String name) {
        this.hp = hp;
        this.dmg = dmg;
        this.lvl = lvl;
        this.name = name;
    }

    public void hit(Ritter gegner){

        gegner.hp = gegner.hp - dmg;

    }


}
