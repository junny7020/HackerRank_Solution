package Loops;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        sc.close();

        for(int i=1;i<=10;i++)
        {
            System.out.println(myInt + " x " + i + " = " + i*myInt);
        }
    }
}
