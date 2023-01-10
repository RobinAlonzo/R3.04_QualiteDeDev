public class Main {
    public static void main(String[] args) {
        Disponible utilise = new Disponible();
        ICible cible = new Adaptateur();
        cible.operation();
    }
}