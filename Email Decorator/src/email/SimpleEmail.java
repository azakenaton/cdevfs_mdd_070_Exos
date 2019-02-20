package email;

public class SimpleEmail implements Email {

    private String texte;

    public SimpleEmail(String texte) {
        this.texte = texte;
    }

    public void envoyer(){
        System.out.println(texte);
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}


