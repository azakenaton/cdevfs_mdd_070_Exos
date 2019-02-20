package email;

public class Signature extends EmailDecorator {

    private String signatureText;

    public Signature(Email email, String signatureText) {
        super(email);
        this.signatureText = signatureText;
    }

    @Override
    public void envoyer() {
        super.envoyer();
        System.out.println(signatureText);
    }
}
