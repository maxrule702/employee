package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String employee;
        int aftertax;
        int hours;
        int wage;
        int end = 0;
        int user;
        int tax =20;
        int pay;
        int extrapay;
        Scanner input = new Scanner(System.in);
        while (end != 1) {
            System.out.println("enter you name"+" ");
            employee = input.next();
            System.out.print("enter your hours worked this week");
            hours = input.nextInt();
            System.out.print("enter your hourly pay");
            wage = input.nextInt();
            if (hours >45) {
                pay = wage * 45;
                hours = hours - 45;
                wage = (int) (wage * 1.5);
                extrapay = wage * hours;
                pay = pay + extrapay;
                aftertax = pay /100;
                aftertax = aftertax *20;
                aftertax = pay - aftertax;
                System.out.println("you have to pay"+" "+employee+" "+pay+" "+"before tax"+" "+"and"+" "+aftertax+" "+ "after tax");
                System.out.print("press 1 for again or 2 for exit ");
                user = input.nextInt();
                if (user == 1) {
                    System.out.println("restarting");
                }
                if (user == 2) {
                    break;
                }
            }
            pay = wage * hours;
            aftertax = pay /100;
            aftertax = aftertax *20;
            aftertax = pay - aftertax;
            System.out.println("you have to pay"+" "+employee+" "+pay+" "+"before tax"+" "+"and"+" "+aftertax+" "+ "after tax");
            System.out.print("press 1 for again or 2 for exit ");
            user = input.nextInt();
            if (user == 1) {
                System.out.println("restarting");
            }
            if (user == 2) {
                break;
            }


        }
    }
}
