public class Decorateur_Champignons extends DecorateurIngredient {
    //Constructeur
    public Decorateur_Champignons(IComposant composant) {
        super(composant);
    }

    //Methodes a decorer
    public String toString() {
        return (composantDecore.toString() + " - champignons");
    }
}
