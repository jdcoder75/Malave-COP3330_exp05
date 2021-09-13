package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Jose Malave
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is the first number? " );
        String firstNum= sc.nextLine();
        System.out.println( "What is the first number?" );
        String secondNum= sc.nextLine();
        int i=Integer.parseInt(firstNum);
        int y=Integer.parseInt(secondNum);
        System.out.println(i + "+" + y + "=" + (i+y) + "\n" +
                           i + "-" + y + "=" + (i-y) + "\n" +
                           i + "*" + y + "=" + (i*y) + "\n" +
                           i + "/" + y + "=" + (i/y) );
    }
}
