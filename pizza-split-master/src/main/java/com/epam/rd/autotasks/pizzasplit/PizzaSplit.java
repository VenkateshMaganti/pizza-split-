package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner s = new Scanner(System.in);

        int persons = s.nextInt();
        int pieces = s.nextInt();

        //int res = (persons > pieces) ? persons : pieces;
        int res = Math.max(persons, pieces);
        while(true){
            if(res % persons == 0 && res % pieces == 0){
                break;
            }
            res++;
        }
        System.out.println(res / pieces);
//        int res, i = 1;
//        if(pieces < persons) {
//            res = -1;
//        } else {
//            while(i != 0) {
//                res = pieces * i;
//                if (i == res / persons) {
//                    System.out.println(i);
//                    break;
//                }
//                ++i;
//            }
//        }
    }
}
