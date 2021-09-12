import java.util.ArrayList;

public class Paquet {
    private ArrayList<Carte> paquet = new ArrayList<Carte>();

    public Paquet() {
        for (String couleurs : Carte.couleurList) {
            for(String valeurs : Carte.valeurList) {
                Carte carte = new Carte(couleurs,valeurs);
                this.paquet.add(carte);

            }
        }
    }


    public ArrayList<Carte> getPaquet(){
        return this.paquet;
    } 

}