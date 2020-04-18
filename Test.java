package P2;

import java.util.Random;

public class Test {
    public static void main(String [] args){


            Random random = new Random();

            int n = random.nextInt(10);

            System.out.println(n);
            System.out.println(random.nextInt(5));
            System.out.println(random.nextInt(2));

    }
}
