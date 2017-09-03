package Ritterspiel;

/**
 * Created by noahz on 31.03.2017.
 */
public class Ruestung {
    private int hp;
    private int lvl;
    private Material material;
    private String name;


    public Ruestung(int hp, int lvl, String name, Material material) {
        this.setHp(hp);
        this.setLvl(lvl);
        this.setMaterial(material);
        this.setName(name);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

