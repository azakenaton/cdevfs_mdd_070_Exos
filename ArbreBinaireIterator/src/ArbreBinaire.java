import java.util.Iterator;

public class ArbreBinaire implements Iterable<ArbreBinaire>{

    private String etiquette;
    private ArbreBinaire filsGauche = null;
    private ArbreBinaire filsDroit = null;
    private boolean visited = false;

    public ArbreBinaire(String etiquette) {
        this.etiquette = etiquette;
    }

    public ArbreBinaire(String etiquette, ArbreBinaire filsGauche) {
        this.etiquette = etiquette;
        this.filsGauche = filsGauche;
    }

    public ArbreBinaire(String etiquette, ArbreBinaire filsGauche, ArbreBinaire filsDroit) {
        this.etiquette = etiquette;
        this.filsGauche = filsGauche;
        this.filsDroit = filsDroit;
    }

    public ArbreBinaire getFilsGauche() {
        return filsGauche;
    }

    public void setFilsGauche(ArbreBinaire filsGauche) {
        this.filsGauche = filsGauche;
    }

    public ArbreBinaire getFilsDroit() {
        return filsDroit;
    }

    public void setFilsDroit(ArbreBinaire filsDroit) {
        this.filsDroit = filsDroit;
    }

    public String getEtiquette() {
        return etiquette;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public Iterator<ArbreBinaire> iterator() {
        return new ArbreBinaireIterator(this);
    }
}
