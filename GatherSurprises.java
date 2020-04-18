package P2;


import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {

    private static Random r;


    private static String[] surprise;

    private GatherSurprises() {
    }

    public static ArrayList<ISurprise> gather(int n) {

        ArrayList<ISurprise> surprise = new ArrayList<>();


        r = new Random();


        for (int i = 0; i < n; i++) {

            int random = Math.abs(r.nextInt(3));
            if (random == 0){
                FortuneCookie fc = new FortuneCookie();
                surprise.add(fc);
            }
            else if (random == 1) {
                Candies candy = new Candies(0,"Vanilla");
                surprise.add(candy);
            } else {
                MinionToy mToy = new MinionToy("Larry");
                surprise.add(mToy);

            }

        }


        return surprise;
    }


    public static String[] gather() {
        surprise = new String[1];
        if (r.nextInt(2) == 0) {
            surprise[0] = FortuneCookie.generate();
        } else if (r.nextInt(2) == 0) {
            surprise[0] = Candies.generate();
        } else {
            surprise[0] = MinionToy.generate();
        }
        return surprise;
    }
}
