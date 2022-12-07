public class Main {
    public static void main(String[] args) {
        ComposantDeBase composantDeBase = new ComposantDeBase();
        composantDeBase.operation();

        DecorateurA_DeComposant A = new DecorateurA_DeComposant(composantDeBase);

        A.operation();

        DecorateurB_DeComposant B = new DecorateurB_DeComposant(composantDeBase);

        B.operation();
    }
}