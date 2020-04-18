package P2;

import java.util.ArrayList;

public class FIFO implements IBag {
    private ArrayList<ISurprise> fifoContainer = new ArrayList<>();
    @Override
    public ISurprise getBag(int i) {

        return  fifoContainer.get(i);
    }

    @Override
    public void put(ISurprise newSurprise) {
        fifoContainer.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {

        while(bagOfSurprises.isEmpty() ==false) {
            fifoContainer.add(bagOfSurprises.takeOut());
        }

    }

    @Override
    public ISurprise takeOut() {
        ISurprise firstSurprise= fifoContainer.get(0);
        fifoContainer.remove(0);
        return firstSurprise;
    }

    @Override
    public boolean isEmpty() {
        if(fifoContainer.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return fifoContainer.size();
    }

    @Override
    public String toString() {
        return "FifoContainer=" + fifoContainer ;
    }


    public void display(){
        for(int i=0;i<this.fifoContainer.size();i++)
            System.out.println(fifoContainer.get(i));
    }

}
