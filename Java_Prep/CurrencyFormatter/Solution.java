package CurrencyFormatter;

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US); 
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + indiaFormat.format(payment).replace("\u20B9", "Rs."));;
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}