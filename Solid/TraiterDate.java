

public class TraiterDate {
    //Attributs
    Date maDate = new Date();

    //Constructeur
    public TraiterDate(Date d) {
        this.maDate = d;
    }

    //Methodes Specifiques
    public int toInt() {
        return (10000 * maDate.get_annee() + 100 * maDate.get_mois() + maDate.get_jour());
    }
}
