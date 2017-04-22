package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public abstract class Waffen {
    private int dmg;
    private int lvl;
    private Material material;
    private String name;

    public Waffen(int dmg, int lvl, Material material, String name) {
        this.dmg = dmg;
        this.lvl = lvl;
        this.material = material;
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

