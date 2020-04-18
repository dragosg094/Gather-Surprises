package P2;

import java.util.ArrayList;

public class MinionToy implements ISurprise{
    private static ArrayList<String > minionNames = new ArrayList<>();
    private static int count = 0;
    private static String result;
    
    public MinionToy(String minionToy) {
        MinionToy.setMinionNames();
        minionNames.add(minionToy);

    }



    public static void setMinionNames() {

        minionNames.add("Dave");
        minionNames.add("Carl");
        minionNames.add("Kevin");
        minionNames.add("Stuart");
        minionNames.add("Jerry");
        minionNames.add("Bob");
        minionNames.add("Carl");
        minionNames.add("Darwin");
        minionNames.add("Tim");
    }

    public  static ArrayList<String> getMinionNames() {

        return minionNames;
    }
    public static String generate(){


        result =MinionToy.getMinionNames().get(count);
        count ++;

        return  "Your minion toy is: "+result;

    }

    @Override
    public void enjoy() {

        System.out.println( generate());
    }

}
