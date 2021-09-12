public class Carte {
    static String[] couleurList = new String [] {"Pique","Coeur","Trèfle","Carreau"};
    static String[] valeurList = new String []{"2","3","4","5","6","7","8","9","10","Valet","Reine","Roi","As"};

    private String couleur;
    private String valeur;

    public Carte(String couleur, String valeur) {
        this.couleur = couleur;
        this.valeur = valeur;
    }
    public Carte() {

    }


    public String getCouleur() {
        return couleur;
    }

    public String getValeur() {
        return valeur;
    }


    public int nameValue(Carte x) {
        int value = 0;

        switch(x.valeur) {
        case "Valet":
            value = 11;
            break;
        case "Reine":
            value = 12;
            break;
        case "Roi":
            value = 13;
            break;
        case "As":
            value = 14;
            break;
        default : 
            value = 0;
        }
        return value;
    } 

    public String compare(Carte a, Carte b) {
        int tempValueA = this.nameValue(a) != 0 ? this.nameValue(a) : Integer.parseInt(a.valeur);
        int tempValueB = this.nameValue(b) != 0 ? this.nameValue(b) : Integer.parseInt(b.valeur);

        if(tempValueA == tempValueB) {
            return "egalité"; 
        }
        else if(tempValueA > tempValueB) {
            return "Joueur 1 gagne ";
        }else {
            return "Joueur 2 gagne";
        }
    }
}