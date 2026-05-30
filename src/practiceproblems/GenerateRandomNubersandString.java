package practiceproblems;

import java.util.Random;

public class GenerateRandomNubersandString {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(100000);
        System.out.println("Random Number: " + num);

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            str.append(chars.charAt(r.nextInt(chars.length())));
        }

        System.out.println("Random String: " + str);
    }
}



















