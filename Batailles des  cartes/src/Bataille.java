import java.util.ArrayList;


public class Bataille {

    public static void main(String[] args) {
        Joueur joueur = new Joueur();
        Joueur joueur2 = new Joueur();
        Paquet paquet = new Paquet();
        Paquet paquet2 = new Paquet();
        Carte carte = new Carte();
        ArrayList<Carte> paquetDeJeu = new ArrayList<Carte>();
        ArrayList<Carte> paquetDeJeu2 = new ArrayList<Carte>();
        
        
        paquetDeJeu = joueur.melanger(paquet,joueur);
        paquetDeJeu2 = joueur2.melanger(paquet2,joueur2);
        
        Boolean win = false ; 
        int manche = 0;
        
        
        while(win == false) {
           
            //System.out.println(carte.compare(paquetDeJeu.get(0), paquetDeJeu2.get(0)) + " la manche n°  " + manche);

            manche ++ ;
            
            if(carte.compare(paquetDeJeu.get(0), paquetDeJeu2.get(0)) == "Joueur 1 gagne") {
                paquetDeJeu.add(paquetDeJeu.get(0));
                paquetDeJeu2.remove(paquetDeJeu2.get(0));
            }
            else if (carte.compare(paquetDeJeu.get(0), paquetDeJeu2.get(0)) == "Joueur 2 gagne") {
                paquetDeJeu2.add(paquetDeJeu2.get(0));
                paquetDeJeu.remove(paquetDeJeu.get(0));
            }
            else {
                
                paquetDeJeu.set(paquetDeJeu.size() -1, paquetDeJeu.get(0));
                paquetDeJeu.remove(0);
                paquetDeJeu.add(paquetDeJeu.set(paquetDeJeu.size() -1, paquetDeJeu.get(0)));
                
                System.out.println(" ");
                
                
                paquetDeJeu2.set(paquetDeJeu2.size() -1, paquetDeJeu2.get(0));
                paquetDeJeu2.remove(0);
                paquetDeJeu2.add(paquetDeJeu2.set(paquetDeJeu2.size() -1, paquetDeJeu2.get(0)));
                
                
            }
            if(paquetDeJeu.size() == 1) {
                win = true;
                System.out.println("Joueur 2 a gagné au bout de : " + manche + " manches" );
            }else if (paquetDeJeu2.size() == 1 ) {
                win = true;
                System.out.println("Joueur 1 a gagné au bout de : " + manche + " manches ");
                
            }

        }
        
        
        
        
        
        
        
        
    }

}
