import java.util.Iterator;
import java.util.Stack;

public class ArbreBinaireIterator implements Iterator<ArbreBinaire> {

    private ArbreBinaire arbreBinaire;
    private Stack pile = new Stack();

    public ArbreBinaireIterator(ArbreBinaire arbreBinaire) {
        this.arbreBinaire = arbreBinaire;
    }

    @Override
    public boolean hasNext() {
            if (arbreBinaire.getFilsDroit() != null /*|| arbreBinaire.getFilsDroit() != null*/) {
            pile.push(arbreBinaire);
            return true;
        } else {
            return false;
            /*arbreBinaire.setVisited(true);
            arbreBinaire = (ArbreBinaire) pile.peek();
            if (arbreBinaire.isVisited()) {
                return false;
            }
            return true;*/
        }
    }

    @Override
    public ArbreBinaire next() {
        /*ArbreBinaire suivant = null;
        if(arbreBinaire.getFilsGauche() != null){
            if(arbreBinaire.getFilsGauche().isVisited()){
                if(arbreBinaire.getFilsDroit() != null && !arbreBinaire.getFilsDroit().isVisited()){
                    suivant = arbreBinaire.getFilsDroit();
                }else{
                    arbreBinaire.setVisited(true);
                    pile.pop();

                }
            }else{
                suivant = arbreBinaire.getFilsGauche();
            }
            suivant = arbreBinaire.getFilsGauche();
            System.out.println(arbreBinaire.getFilsGauche().getEtiquette());
        }*/
        return arbreBinaire.getFilsDroit();
    }
}
