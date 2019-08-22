package Lab6;

import java.util.Scanner;

public class lab6_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        System.out.print("Input a deqree in Celsius: ");
        c = sc.nextDouble();
        double f = (9*c+(32*5))/5;  //  c*9/5+32

        System.out.print(c+ "deqree Celsius is equal to "+f+"in fahrenheit");
    }

    }
