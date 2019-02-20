package email;

public class Entête extends EmailDecorator {

    private String entête = "Bonjour madame, monsieur";

    public Entête(Email email) {
        super(email);
        this.entête = "Bonjour madame, monsieur";
    }

    @Override
    public void envoyer() {
        System.out.println(entête);
        super.envoyer();
    }
}
