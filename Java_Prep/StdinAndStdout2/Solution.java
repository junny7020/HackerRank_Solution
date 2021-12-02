package StdinAndStdout2;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int myInt = sc.nextInt();
        double myDouble = sc.nextDouble();
        String myString = "";
        myString = sc.nextLine();
        myString += sc.nextLine();

        sc.close();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
