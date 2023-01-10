public class Disponible {
    //Atributs
    private int _Age;

    //Constructeur
    public Disponible() {
        _Age = 0;
    }

    public Disponible(int Age) {
        _Age = Age;
    }
    //Encapsulation
    public void setAge (int age) {
        _Age = age;
    }

    public int getAge (int Age) {
        return _Age;
    }
    //Methode
    public int operationDisponible() {
        int nouveauAge = 0;
        nouveauAge = _Age + 6;
        return nouveauAge;
    }
}
