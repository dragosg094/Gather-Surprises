package P2;

public class BagFactory implements IBagFactory{
    @Override
    public IBag makeBag(String type) {
        switch (type){
            case "FIFO":
                return new FIFO();
            case"LIFO":
                return new LIFO();
            case "RANDOM":
                return new RandomGiveAway();
            default:
                return null;
        }
    }
}
