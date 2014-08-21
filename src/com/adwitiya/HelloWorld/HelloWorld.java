package com.adwitiya.HelloWorld;

import java.util.*;

/**
 * Created by adwitiya on 21/08/14.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a number yo: ");

        Scanner input=new Scanner(System.in);
        int s=input.nextInt();

        for(int i=0;i<s;i++) {
            System.err.println("Hello World");
        }
   }
}
