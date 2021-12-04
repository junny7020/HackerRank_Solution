package CurrencyFormatter;

import java.util.Scanner;

public class Solution {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pay = sc.nextDouble();
        System.out.printf("US: " + "$" + "%,.2f\n" + pay);
        System.out.printf("India: Rs.%,.2f\n", + pay);
        System.out.printf("China: ￥%,.2f\n", +pay);
        System.out.printf("France: %,.2f €" + pay);
        sc.close();
    }
}
