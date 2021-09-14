/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */
import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;

public class Main {

    private static DecimalFormat d = new DecimalFormat("#.##");

    public static void main(String[] args) {
	    System.out.println("Enter the principal: ");
        Scanner s1 = new Scanner(System.in);
        int pri = s1.nextInt();
        System.out.println("Enter the rate of interest: ");
        Scanner s2 = new Scanner(System.in);
        double rate_per = s2.nextDouble();
        System.out.println("Enter the number of years: ");
        Scanner s3 = new Scanner(System.in);
        int year = s3.nextInt();

        double rate = rate_per/100;
        double inv = pri *  (1 + rate* (double) year);
        d.setRoundingMode(RoundingMode.UP);
        System.out.println("After " + year + " years at " + rate_per + "%, the investment will be worth $" + d.format(inv));
    }
}
