import java.util.ArrayList;
import java.util.TreeMap;

public class Etat {
    char nom;
    boolean init=false;
    boolean fin=false;
    boolean acc=false;
    boolean coacc=false;
    boolean complet=false;
    TreeMap<Character, ArrayList<Etat>> suivants;

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }

    public boolean isInit() {
        return init;
    }

    public void setInit() {
        this.init = true;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin() {
        this.fin = true;
    }

    public boolean isAcc() {
        return acc;
    }

    public void setAcc() {
        this.acc = true;
    }

    public boolean isCoacc() {
        return coacc;
    }

    public void setCoacc() {
        this.coacc = true;
    }

    public boolean isComplet() {
        return complet;
    }

    public void setComplet(int alpha_length) {
        //Si l'état contient des suivants pour chaque lettre de l'alphabet => il est complet
        if (suivants.size()==alpha_length) this.complet = true;
    }

    public void ajouter_suivant(char lettre, Etat e){
        ArrayList<Etat> s = suivants.get((Character) lettre);

    }
}
