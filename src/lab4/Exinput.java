package lab4;

import java.util.Scanner;

public class Exinput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please. enter an integer: ");
        int x = scanner.nextInt();

        System.out.println("Your entered integer: "+x);


        System.out.println("Please. enter an double: ");
        double Y = scanner.nextDouble();

        System.out.println("Your entered double: "+Y);


        System.out.println("Please. enter you name: ");
        String s = scanner.nextLine();

        System.out.println("Your name is: "+s);






    }


}



