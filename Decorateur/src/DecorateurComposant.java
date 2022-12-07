public abstract class DecorateurComposant implements IComposant {
    //Attribut composantDecore, le composant à décorer
    public IComposant composantDecore;

    //Constructeur
    public DecorateurComposant(IComposant composant) {
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
