package question.study;

import java.util.Random;

public class MyRandom {

    public int nextInt() {

        Random rnd = new Random();

        return rnd.nextInt();

    }

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

    //4. 논리
    public boolean nextBoolean() {

        Random rnd = new Random();

        return rnd.nextBoolean();

    }

}
