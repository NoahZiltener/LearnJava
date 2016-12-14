package Tiere;

/**
 * Created by Noah on 14.12.2016.
 */
public class Katze extends Tier{


    public Katze(int beine, int geschwindikeit, int groesse) {
        super(beine, geschwindikeit, groesse);
    }

    public void miauen(){
        System.out.println("Miauuuuuuuuuu");
    }

    @Override
    public int sprunghoehe() {
        return 3 * super.getGroesse();
    }
}
