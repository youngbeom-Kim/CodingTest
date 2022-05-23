package study;

import java.util.Random;

public class UtilRandom extends Random {

    //2. 3 ~ 12 난수
    public int nextTinyInt() {

        Random rnd = new Random();

        return rnd.nextInt(10) + 3;

    }

    //3. color
    public String nextColor() {

        String[] colors = {"red", "yellow", "blue", "orange", "green"};

        Random rnd = new Random();

        return colors[rnd.nextInt(colors.length)];

    }

}
