package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Waffen {
    public int dmg;
    public int lvl;
    public String material;
    public String name;

    public Waffen(int dmg, int lvl, String material, String name) {
        this.dmg = dmg;
        this.lvl = lvl;
        this.material = material;
        this.name = name;
    }
}
