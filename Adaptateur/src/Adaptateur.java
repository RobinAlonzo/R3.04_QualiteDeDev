public class Adaptateur implements ICible{
    //Attributs
    private Disponible _adapte;

    //Constructeur
    public Adaptateur () {
        _adapte = new Disponible();
    }

    //Encapsulation
    public Disponible getAdapte(){
        return this._adapte;
    }

    //Methode
    public void operation() {
        System.out.println(this.getAdapte());
        System.out.println("l'age est de : " + this._adapte.operationDisponible());
    }
}
