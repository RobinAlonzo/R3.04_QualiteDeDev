public abstract class DecorateurIngredient implements IComposant {
    //Attribut composantDecore, le composant à décorer
    public IComposant composantDecore;

    //Constructeur
    public DecorateurIngredient(IComposant composant) {
        setComposantDecore(composant);
    }

    //Methodes encapsulation
    public void setComposantDecore(IComposant composantDecore) {
        this.composantDecore = composantDecore;
    }

    public IComposant getComposantDecore() {
        return composantDecore;
    }
}
