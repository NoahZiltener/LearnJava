package Ritterspiel;

/**
 * Created by noahz on 15.03.2017.
 */
public class Material {
    private String material;
    private float gewicht;
    private String farbe;

    public Material(String material, float gewicht, String farbe) {
        this.setMaterial(material);
        this.setGewicht(gewicht);
        this.setFarbe(farbe);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getGewicht() {
        return gewicht;
    }

    public void setGewicht(float gewicht) {
        this.gewicht = gewicht;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
