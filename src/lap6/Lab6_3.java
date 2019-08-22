package lab6;

import java.util.Scanner;

public class lab6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Weight:");
        float weight = in.nextFloat();

        System.out.println("Height: ");
        Float height = in.nextFloat();

        float bmi = weight*10000.00f/(height*height);
        System.out.println(bmi);

        in.close();
    }
}



