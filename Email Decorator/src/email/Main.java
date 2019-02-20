package email;

public class Main {

    public static void main(String... args) {
        // Mail simple
        Email simpleEmail = new SimpleEmail("Coucou je suis le texte");
        simpleEmail.envoyer();
        System.out.println("=========================================");

        //Mail avec ajout de l'en-tête
        Email enteteEmail = new Entête(
                new SimpleEmail("coucou je suis le corps du mail"));
        enteteEmail.envoyer();
        System.out.println("==========================================");

        // Mail avec signature et en-tête
        Email allEmail = new Entête(
                new Signature(
                        new SimpleEmail("coucou je suis le corps du mail"),
                        "Hyvernat Luc")
                );
        allEmail.envoyer();
        System.out.println("==========================================");
    }
}
