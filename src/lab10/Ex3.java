package lab10;

import java.util.Scanner;

public class Ex3 {
    public static final int MAX =5;

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int num[] = new int[MAX];

        for (int i =0; i < num.length;i++){
            System.out.print("enter an number");
            num[i]= sc.nextInt();
        }

        findAverrage(num);

    }

    private static void findAverrage(int[] num) {
        int total = 0;
        for (int val:num) {
            total +=val;

        }
        System.out.println("total value:"+total);
        System.out.println("Average value:"+(total/num.length));
    }

}
