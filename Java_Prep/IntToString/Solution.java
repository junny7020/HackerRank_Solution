package IntToString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try{
            String s = String.valueOf(n);
            if (s == null){
                new Exception();
            }
            System.out.println("Good job");
        }catch(Exception e){
            System.out.print("Wrong answer");
        }
        sc.close();

    }
}
