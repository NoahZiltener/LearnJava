package Ritterspiel;

/**
 * Created by noahz on 31.03.2017.
 */
public class Ruestung {
    public int hp;
    public int lvl;
    public Material material;
    public String name;


    public Ruestung(int hp, int lvl, String name, Material material) {
        this.hp = hp;
        this.lvl = lvl;
        this.material = material;
        this.name = name;
    }
}

