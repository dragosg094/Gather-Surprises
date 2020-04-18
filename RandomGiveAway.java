package P2;

import java.util.ArrayList;
import java.util.Random;

public class RandomGiveAway implements IBag {
    private ArrayList<ISurprise> randomContainer = new ArrayList<>();
    private Random randomNumber = new Random();

    public ArrayList<ISurprise> getRandomContainer() {
        return randomContainer;
    }
    public ISurprise getBag(int i) {

        return  randomContainer.get(i);
    }
    @Override
    public void put(ISurprise newSurprise) {
        getRandomContainer().add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {

        while(bagOfSurprises.isEmpty() ==false) {
            randomContainer.add(bagOfSurprises.takeOut());
        }

    }

    @Override
    public String toString() {
        return "RandomContainer=" + randomContainer ;
    }

    @Override
    public ISurprise takeOut() {
        int index = getRandomContainer().size() -1;

        ISurprise randomSurprise ;

        if(index == 0){
            randomSurprise= getRandomContainer().get(0);
        }else {
            randomSurprise = getRandomContainer().get(randomNumber.nextInt(index));
        }
        getRandomContainer().remove(randomSurprise);

        return randomSurprise;
    }

    @Override
    public boolean isEmpty() {
        if(getRandomContainer().isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return getRandomContainer().size();
    }
}
