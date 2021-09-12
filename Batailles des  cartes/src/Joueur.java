import java.util.ArrayList;
import java.util.Collections;

public class Joueur {
    private ArrayList<Carte>paquetDuJoueur = new ArrayList<Carte>();

    public Joueur() {

    }

    public ArrayList<Carte> getCarteDuJoueur() {
        return this.paquetDuJoueur;
    }

    public ArrayList<Carte> melanger(Paquet paquetAMelanger,Joueur paquetDuJoueur){
        ArrayList<Carte>paquetAdistribuer = new ArrayList<Carte>();

        for(Carte carte : paquetAMelanger.getPaquet()) {
            paquetAdistribuer.add(carte);
        }
        Collections.shuffle(paquetAdistribuer);
        paquetDuJoueur.getCarteDuJoueur().addAll(paquetAdistribuer);
        return paquetDuJoueur.getCarteDuJoueur();
    }
}