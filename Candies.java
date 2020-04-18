package P2;

import java.util.ArrayList;
import java.util.Random;

public class Candies  implements ISurprise {
    public static Random random = new Random();
    private static int  numberOfCandies;



    private static ArrayList<String> typesOfCandies = new ArrayList<>();


    public Candies(int candyNumber, String typeOfCandy) {
        numberOfCandies = candyNumber;
        typesOfCandies.add(typeOfCandy);
    }



    @Override
    public void enjoy() {

        System.out.println(generate());
    }


    public static int getNumberOfCandies() {
        return numberOfCandies;
    }

    public static ArrayList<String> getTypesOfCandies() {
        return typesOfCandies;
    }
    public static void setTypesOfCandies(ArrayList<String> candy) {

        typesOfCandies.add("Almond Candy");
        typesOfCandies.add("Anise Candy");
        typesOfCandies.add("Banana Candy");
        typesOfCandies.add("Blueberry Candy");
        typesOfCandies.add("Caramels");
        typesOfCandies.add("Cocktail Classics");
        typesOfCandies.add("Cherry Candy");
        typesOfCandies.add("Coconut Candy");
        typesOfCandies.add("Doughnut");
        candy = typesOfCandies;

    }


    public static String generate(){
        int candyNumber =random.nextInt(getTypesOfCandies().size() );
        int pieces = random.nextInt(10);
        Candies.setTypesOfCandies(typesOfCandies);
        String typesOfCandies = Candies.getTypesOfCandies().get(candyNumber);


        return "You have "+ pieces+ " pieces of "+ typesOfCandies+"!";

    }


}
