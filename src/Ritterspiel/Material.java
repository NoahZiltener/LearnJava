package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Material {
    private String material;
    private float gewicht;
    private  String farbe;

    public Material(String material, float gewicht, String farbe) {
        this.material = material;
        this.gewicht = gewicht;
        this.material = material;
        this.farbe = farbe;
    }

    public String getMaterial() {
        return material;
    }

    public float getGewicht() {
        return gewicht;
    }

    public String getFarbe() {
        return farbe;
    }
}
