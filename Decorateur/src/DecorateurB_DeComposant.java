public class DecorateurB_DeComposant extends DecorateurComposant {
    //Constructeur
    public DecorateurB_DeComposant(IComposant composant) {
        super(composant);
    }

    //Methodes a decorer
    public void operation() {
        System.out.println("#Prédécoration B#");
        composantDecore.operation();
        System.out.println("#Postdécoration B#");
    }
}
