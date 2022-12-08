public class Decorateur_Olives extends DecorateurIngredient {
    //Constructeur
    public Decorateur_Olives(IComposant composant) {
        super(composant);
    }

    //Methodes a decorer
    public String toString() {
        return (composantDecore.toString() + " - Olive");
    }
}
