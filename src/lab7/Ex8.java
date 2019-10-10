package lab7;

public class Ex8 {
    public static void min(String[] args) {

        for (int i = 8; i > 1; i--) {
            for (int j = i; j >= i; j++) {
                System.out.print("*");
            }//for i

        }
        System.out.print("\n\n");

        for (int i = 8; i > 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }//for j
            System.out.println();
        }//for i

        System.out.print("\n\n");

        int count = 1;
        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(count + "");
            }//for i

        }

    }
}