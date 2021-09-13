package com.example;

import java.util.Scanner;
import java.time.YearMonth;
/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Richard Nham
 */

public class Main {

    public static void main(String[] args) {
        Scanner scannerUserInput= new Scanner(System.in);
        int age;
        int retire;
        int years;

        System.out.printf("What is your current age?" );
        age =  scannerUserInput.nextInt();

        System.out.printf("At what age would you like to retire?" );
        retire =  scannerUserInput.nextInt();

        years = retire - age;

        if(years <= 0){
            System.out.printf("You can already retire." );
        }else{
            System.out.println("You have "+years+" years left for retirement." );
            int current_year = YearMonth.now().getYear();
            int retirement_year = current_year + years;
            System.out.println("Its " + current_year+ ", you can retire in " + retirement_year +"." );
        }
        scannerUserInput.close();
    }

}
