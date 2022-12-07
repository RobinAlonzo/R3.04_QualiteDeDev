public class DecorateurA_DeComposant extends DecorateurComposant {
    //Constructeur
    public DecorateurA_DeComposant(IComposant composant) {
        super(composant);
    }

    //Methodes a decorer
    public void operation() {
        System.out.println("#Prédécoration A#");
        composantDecore.operation();
        System.out.println("#Postdécoration A#");
    }
}
