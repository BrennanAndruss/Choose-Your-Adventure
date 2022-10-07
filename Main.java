/*
Choose Your Adventure
Brennan and Cade
10/7/2022
AP Computer Science A Trimester 1 Woldseth

Description: Plan a picnic
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        String[] choices = {"location", "time", "food"};
        System.out.println("\nWhat will you plan?");
        System.out.println("1) " + choices[0]);
        System.out.println("2) " + choices[1]);
        System.out.println("3) " + choices[2]);
        int input1 = sc.nextInt();
        int input2 = 0;

        if (input1 == 1) {
            String[] locations = {"beach", "forest", "park"};
            System.out.println("\nWhere should the picnic be?");
            System.out.println("1) " + locations[0]);
            System.out.println("2) " + locations[1]);
            System.out.println("3) " + locations[2]);
            input2 = sc.nextInt();
        }
        // beach -- dolphin
        // forest -- bears
        // park -- birds
        
        if (input1 == 2) {
            String[] times = {"morning", "afternoon", "evening"};
            System.out.println("\nWhen should the picnic be?");
            System.out.println("1) " + times[0]);
            System.out.println("2) " + times[1]);
            System.out.println("3) " + times[2]);
            input2 = sc.nextInt();
        }
        // morning -- sunrise
        // afternoon -- nothing
        // evening -- sunset

        if (input1 == 3) {
            String[] foods = {"sandwiches", "fruits", "snacks"};
            System.out.println("\nWhat food should be at the picnic?");
            System.out.println("1) " + foods[0]);
            System.out.println("2) " + foods[1]);
            System.out.println("3) " + foods[2]);
            input2 = sc.nextInt();
        }

        if (input1 == 1){
            if (input2 == 1){
                System.out.println("1");
            }
            if (input2 == 2){
                System.out.println("2");
            }
            if (input2 == 3){
                System.out.println("3");
            }
        } else if (input1 == 2){
            if (input2 == 1){
                System.out.println(1);
            }
            if (input2 ==2){
                System.out.println(2);
            }
            if (input2 == 3){
                System.out.println(3);
            } 
        } else {
            if (input2 == 1){
                System.out.println(1);
            }
            if (input2 ==2){
                System.out.println(2);
            }
            if (input2 == 3){
                System.out.println(3);
            }
        }


        // nested ifs
            // if beach
                // if morning
                // else if afternoon
                // else
            // if park
                // if morning
                // else if afternoon
                // else 
            // if forest
                // if morning
                // else if afternoon
                // else 

        // compound booleans
            // forest and night -- bear attack
            // park and morning -- bird raid
            // if (forest and night, park and morning)

        sc.close();
    }
}