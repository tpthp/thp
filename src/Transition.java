public class Transition {
    Etat debut;
    char lettre;
    Etat fin;

    public Transition(Etat debut, char lettre, Etat fin) {
        this.debut = debut;
        this.lettre = lettre;
        this.fin = fin;
    }

    public Etat getDebut() {
        return debut;
    }

    public void setDebut(Etat debut) {
        this.debut = debut;
    }

    public char getLettre() {
        return lettre;
    }

    public void setLettre(char lettre) {
        this.lettre = lettre;
    }

    public Etat getFin() {
        return fin;
    }

    public void setFin(Etat fin) {
        this.fin = fin;
    }
}
