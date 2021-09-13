/*
 *  UCF COP3330 Fall 2021 Exercise 22 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise22;
import java.util.*;

public class Exercise22 {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(sc.nextInt());
        System.out.println("Enter the second number: ");
        list.add(sc.nextInt());
        System.out.println("Enter the third number: ");
        list.add(sc.nextInt());

        if (list.get(0).equals(list.get(1))||list.get(0).equals(list.get(2))||list.get(1).equals(list.get(2))) {
            System.exit(-1);
        }
        int max = list.get(0);
        for (int i=0; i<3; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("The largest number is "+max);
    }
}
