package P2;



import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        //Crearea surprizelor
        ISurprise fCookie = new FortuneCookie();
        ISurprise candy = new Candies(4, "dsad");
        ISurprise mToy = new MinionToy("Larry");

        ArrayList<ISurprise> list = new ArrayList<>();
        list.add(fCookie);
        list.add(candy);
        list.add(mToy);

        IBag fifoContainer = new FIFO();
        IBag lifoContainer = new LIFO();
        IBag randomContainer = new RandomGiveAway();
        //Se adauga cele 3 surprize in containere
        for (int i = 0; i < 3; i++) {
            fifoContainer.put(list.get(i));
            lifoContainer.put(list.get(i));
            randomContainer.put(list.get(i));
        }
        //Container-ul Fifo
        System.out.println("Containerul FIFO contine:");
        for (int i = 0; i < fifoContainer.size(); i++) {
            fifoContainer.getBag(i).enjoy();
        }
        //Container-ul LIFO
        System.out.println("Containerul LIFO contine:");
        for (int i = 0; i < lifoContainer.size(); i++) {
            lifoContainer.getBag(i).enjoy();
        }
        //Container-ul RANDOM
        System.out.println("Containerul RANDOM contine:");
        for (int i = 0; i < randomContainer.size(); i++) {
            randomContainer.getBag(i).enjoy();
        }

        //Scoaterea surprizelor din containere

        while(fifoContainer.isEmpty()==false){
            fifoContainer.takeOut().enjoy();
        }
        while(lifoContainer.isEmpty()==false){
            lifoContainer.takeOut().enjoy();
        }
        while(randomContainer.isEmpty()==false){
            randomContainer.takeOut().enjoy();
        }

        //Verificarea dimensiunii containere-lor

        System.out.println("Container-ul FIFO are dimensiunea "+fifoContainer.size());
        System.out.println("Container-ul LIFO are dimensiunea "+lifoContainer.size());
        System.out.println("Container-ul RANDOM are dimensiunea "+randomContainer.size());


        //Generarea surprizelor prin clasa AbstractGiveSurprises


        ArrayList<ISurprise> generatedSurprise = new ArrayList<>();
        list = GatherSurprises.gather(7);
        generatedSurprise.addAll(list);

        //Crearea containerelor
        IBagFactory container = new BagFactory();


        //Impartirea surprizelor

        AbstractGiveSurprises surprise = new GiveSurpriseAndHug("FIFO", 1);
        AbstractGiveSurprises surprise1 = new GiveSurpriseAndSing("LIFO", 2);
        AbstractGiveSurprises surprise2 = new GiveSurprisesAndApplause("RANDOM", 3);

        for (ISurprise i : generatedSurprise) {

            surprise.put(i);
        }
        for (ISurprise i : generatedSurprise) {

            surprise1.put(i);
        }
        for (ISurprise i : generatedSurprise) {

            surprise2.put(i);
        }

        //Impartirea surprizelor

        surprise1.giveAll();
        surprise1.giveWithPassion();

        System.out.println("===================");
        surprise.giveAll();
        surprise.giveWithPassion();

        System.out.println("===================");
        surprise2.giveAll();
        surprise2.giveWithPassion();


    }
}



