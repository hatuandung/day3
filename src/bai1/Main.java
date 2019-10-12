package bai1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String myName = "Hà Tuấn Dũng ";
        System.out.println(myName + number);
    }
}
