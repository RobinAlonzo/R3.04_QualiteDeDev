// Programme qui illustre la mise en œuvre du Patron de Conception Décorateur
public class Main {
    // METHODE PRINCIPALE : main ()
    public static void main(String[] args) {
        // Création d’une Pizza
        IComposant unePizaa = new PizzaDeBase();
        //Affichage de la pizza de base
        System.out.println(unePizaa.toString());

        //Creation d'un autre composant
        IComposant autreIngredient = new PizzaDeBase();

        //On rajoute les olives
        autreIngredient = new Decorateur_Olives(autreIngredient);
        System.out.println(autreIngredient.toString());

        //On rajoute les champignons
        autreIngredient = new Decorateur_Champignons(autreIngredient);
        System.out.println(autreIngredient.toString());

    }
}