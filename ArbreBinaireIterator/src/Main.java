import java.util.Iterator;
import java.util.Stack;

public class Main {

    private ArbreBinaire arbre;

    public Main() {
        arbre = new ArbreBinaire("1", new ArbreBinaire("2",new ArbreBinaire("4",new ArbreBinaire("7")),new ArbreBinaire("5")), new ArbreBinaire("3",new ArbreBinaire("6")));
    }

    public void parcoursArbre(){

        System.out.println("Début du parcours, le parcours choisit est de gauche à droite en longueur." +
                "On devrait donc obtenir dans l'ordre 1 - 2 - 4 - 7 - 5 - 3 - 6");
        System.out.println("===============================================");
        System.out.println("Racine : 1");
        for(Iterator<ArbreBinaire> iterator = arbre.iterator(); iterator.hasNext();){
            ArbreBinaire monNoeud = iterator.next();
            System.out.println(monNoeud.getEtiquette());
            System.out.println("--------------------");
        }
    }

    public static void main(String... args) {

        Main monArbre = new Main();
        monArbre.parcoursArbre();
    }
}
