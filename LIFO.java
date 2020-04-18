package P2;

import java.util.ArrayList;

public class LIFO implements IBag {
    private ArrayList<ISurprise> lifoContainer = new ArrayList<>();

    public ArrayList<ISurprise> getLifoContainer() {
        return lifoContainer;
    }

    @Override
    public ISurprise getBag(int i) {
        return lifoContainer.get(i);
    }

    @Override
    public void put(ISurprise newSurprise) {
        getLifoContainer().add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(bagOfSurprises.isEmpty() ==false) {
            lifoContainer.add(bagOfSurprises.takeOut());
        }

    }

    @Override
    public String toString() {
        return "LifoContainer=" + lifoContainer;
    }

    @Override
    public ISurprise takeOut() {
        ISurprise lastSurprise= getLifoContainer().get(getLifoContainer().size()-1);
        getLifoContainer().remove(getLifoContainer().size()-1);
        return lastSurprise;
    }

    @Override
    public boolean isEmpty() {
        if(getLifoContainer().isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return getLifoContainer().size();
    }

    public void display(){
        for(int i=0;i<this.lifoContainer.size();i++)
            System.out.println(lifoContainer.get(i));
    }
}
