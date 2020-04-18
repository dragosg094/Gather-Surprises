package P2;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises  {
    private IBag container;
    private IBagFactory factory = new BagFactory();
    private int waitTime;

    public AbstractGiveSurprises(String type, int waitTime) {

        container = factory.makeBag(type);
        this.waitTime =waitTime;
    }


    public void put(ISurprise newSurprise) {
        container.put(newSurprise);

    }


    public void put(IBag bagOfSurprises) {

        container.put(bagOfSurprises);
    }


    @Override
    public String toString() {
        return "Surprises: "+
                 container
                ;
    }

    public ISurprise give() {
        ISurprise surprise = container.takeOut();
        surprise.enjoy();
        return surprise;
    }

    public  void giveAll() {

        while(container.isEmpty()==false){
            container.takeOut().enjoy();
            try {
                TimeUnit.SECONDS.sleep(waitTime);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }


    public boolean isEmpty() {
        if(container.isEmpty()){
            return true;
        }
        return false;
    }


    public abstract void giveWithPassion();
}
