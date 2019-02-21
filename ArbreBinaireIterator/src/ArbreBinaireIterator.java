import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class ArbreBinaireIterator implements Iterator<ArbreBinaire> {

    private ArbreBinaire arbreBinaire;
    private Stack<ArbreBinaire> pile = new Stack<ArbreBinaire>();

    public ArbreBinaireIterator(ArbreBinaire arbreBinaire) {
        this.arbreBinaire = arbreBinaire;
    }

    @Override
    public boolean hasNext() {
        if (arbreBinaire.getFilsGauche() != null && !arbreBinaire.getFilsGauche().isVisited()) {
            return true;
        }
        if (arbreBinaire.getFilsDroit() != null && !arbreBinaire.getFilsDroit().isVisited()) {
            return true;
        }
        Stack<ArbreBinaire> tempPile = pile;
        ArbreBinaire tempArbre = tempPile.pop();
        while (tempArbre != null) {
            if (tempArbre.getFilsDroit() != null && !tempArbre.getFilsDroit().isVisited()) return true;
            tempArbre = tempPile.pop();
        }
        return false;
    }

    @Override
    public ArbreBinaire next() {
        if (arbreBinaire.getFilsGauche() != null && !arbreBinaire.isVisited()) {
            pile.push(arbreBinaire);
            arbreBinaire.setVisited(true);
            arbreBinaire = arbreBinaire.getFilsGauche();
            return arbreBinaire;
        }
        if (arbreBinaire.getFilsDroit() != null && !arbreBinaire.isVisited()) {
            pile.push(arbreBinaire);
            arbreBinaire.setVisited(true);
            arbreBinaire = arbreBinaire.getFilsDroit();
            return arbreBinaire;
        }
        while (!pile.empty()) {
            arbreBinaire = pile.pop();
            if (arbreBinaire.getFilsDroit() != null && !arbreBinaire.getFilsDroit().isVisited()) {
                pile.push(arbreBinaire);
                arbreBinaire = arbreBinaire.getFilsDroit();
                return arbreBinaire;
            }
        }
        return null;
    }
}
