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
        String[] locations = {"beach", "forest", "park"};
        String[] times = {"morning", "afternoon", "evening"};
        String[] foods = {"sandwiches", "fruits", "snacks"};
        
        System.out.println("\nWhat will you plan?");
        System.out.println("1) " + choices[0]);
        System.out.println("2) " + choices[1]);
        System.out.println("3) " + choices[2]);
        int input1 = sc.nextInt();
        int input2 = 0;
        int input3 = 0;
        int input4 = 0;

        if (input1 == 1) {
            
            System.out.println("\nWhere should the picnic be?");
            System.out.println("1) " + locations[0]);
            System.out.println("2) " + locations[1]);
            System.out.println("3) " + locations[2]);
            input2 = sc.nextInt() - 1;
        } else {
            input2 = (int) (Math.random() * 3);
        }
        // beach -- dolphin
        // forest -- bears
        // park -- birds
        
        if (input1 == 2) {
            
            System.out.println("\nWhen should the picnic be?");
            System.out.println("1) " + times[0]);
            System.out.println("2) " + times[1]);
            System.out.println("3) " + times[2]);
            input3 = sc.nextInt() - 1;
        } else {
            input3 = (int) (Math.random() * 3);
        }
        // morning -- sunrise
        // afternoon -- nothing
        // evening -- sunset

        if (input1 == 3) {
            
            System.out.println("\nWhat food should be at the picnic?");
            System.out.println("1) " + foods[0]);
            System.out.println("2) " + foods[1]);
            System.out.println("3) " + foods[2]);
            input4 = sc.nextInt() - 1;
        } else {
            input4 = (int) (Math.random() * 3);
        }

        //
        System.out.println(locations[input2]);
        System.out.println(times[input3]);
        System.out.println(foods[input4]);

        
        // Selected beach
        if (input2 == 0){
            if (input3 == 0){
                System.out.println("1");
            }
            else if (input3 == 1){
                System.out.println("2");
            }
            else {
                System.out.println("3");
            }
        } 

        // Selected forest
        else if (input2 == 1){
            if (input3 == 2 && input4 == 0) {
                // special case: bear attack
            }
            else {
                if (input3 == 0){
                    System.out.println(1);
                }
                else if (input3 == 1){
                    System.out.println(2);
                }
                else {

                }
            }
        } 
        
        // Selected park
        else {
            if (input3 == 0 && input4 != 0) {
                // special case: bird attack
            }
            else {
                if (input3 == 0){
                    System.out.println(1);
                }
                else if (input3 == 1){
                    System.out.println(2);
                }
                else {

                }
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
            // forest and night and sandwiches -- bear attack
            // park and morning and snacks/fruit -- bird raid
            // if (forest and night, park and morning)

        sc.close();
    }
}