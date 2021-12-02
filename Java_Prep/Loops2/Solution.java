package Loops2;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        for(int j=0;j<i;j++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int outputInt = a;

            for(int k=0;k<n;k++)
            {
                outputInt += Math.pow(2, (double)k)*b;
                System.out.print(outputInt + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
