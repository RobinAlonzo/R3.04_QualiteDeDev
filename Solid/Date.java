public class Date {
    //Attributs
    private int _annee;
    private int _mois;
    private int _jour;

    //Constructeur
    //Par defaut
    public Date() {
        _annee = 0;
        _mois = 0;
        _jour = 0;
    }
    //Par attribut
    public Date(int annee, int mois, int jour) {
        _annee = annee;
        _mois = mois;
        _jour = jour;
    }

    //Par recopie
    public Date(Date dateModele) {
        set_annee(dateModele.get_annee());
        set_mois(dateModele.get_mois());
        set_jour(dateModele.get_jour());
    }

    //Methodes : Encapsulation
    public void set_annee(int _annee) {
        this._annee = _annee;
    }

    public void set_mois(int _mois) {
        this._mois = _mois;
    }

    public void set_jour(int _jour) {
        this._jour = _jour;
    }

    public int get_annee() {
        return _annee;
    }

    public int get_jour() {
        return _jour;
    }

    public int get_mois() {
        return _mois;
    }
}
