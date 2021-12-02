package If_Else;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.close();

        if(myInt % 2 == 1){
            System.out.println("Weird");
        }
        else{
            if(myInt <= 5 && myInt >= 2){
                System.out.println("Not Weird");
            }
            else if(myInt<=20 && myInt>=6){
                System.out.println("Weird");
            }
            else if(myInt>20){
                System.out.println("Not Weird");
            }
        }

    }
}
