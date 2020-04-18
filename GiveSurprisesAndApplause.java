package P2;

public class GiveSurprisesAndApplause extends AbstractGiveSurprises {
    public GiveSurprisesAndApplause(String type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }
}
