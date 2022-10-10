/*
Choose Your Adventure
Brennan and Cade
10/7/2022
AP Computer Science A Trimester 1 Woldseth

Description: Plan a picnic
*/

import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

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
        int choiceInput = sc.nextInt();
        int locationInput = 0;
        int timeInput = 0;
        int foodInput = 0;

        if (choiceInput == 1) {
            
            System.out.println("\nWhere should the picnic be?");
            System.out.println("1) " + locations[0]);
            System.out.println("2) " + locations[1]);
            System.out.println("3) " + locations[2]);
            locationInput = sc.nextInt() - 1;
        } else {
            locationInput = (int) (Math.random() * 3);
        }
        // beach -- dolphin
        // forest -- bears
        // park -- birds
        
        if (choiceInput == 2) {
            
            System.out.println("\nWhen should the picnic be?");
            System.out.println("1) " + times[0]);
            System.out.println("2) " + times[1]);
            System.out.println("3) " + times[2]);
            timeInput = sc.nextInt() - 1;
        } else {
            timeInput = (int) (Math.random() * 3);
        }
        // morning -- sunrise
        // afternoon -- nothing
        // evening -- sunset

        if (choiceInput == 3) {
            
            System.out.println("\nWhat food should be at the picnic?");
            System.out.println("1) " + foods[0]);
            System.out.println("2) " + foods[1]);
            System.out.println("3) " + foods[2]);
            foodInput = sc.nextInt() - 1;
            
        } else {
            foodInput = (int) (Math.random() * 3);
        }

        //
        System.out.println(locations[locationInput]);
        System.out.println(times[timeInput]);
        System.out.println(foods[foodInput]);

        
        // Selected beach
        if (locationInput == 1){
            if (timeInput == 0){
                System.out.println("You went on a picnic at the beach in the morning." +
                                    "\nYou and your friends feasted on " + foods[foodInput] + " as you watched dolphins jump through the crystal clear waters.");
            }
            else if (timeInput == 1){
                System.out.println("2");
            }
            else {
                System.out.println("You went on a picnic at the beach in the evening." +
                                    "\nYou and your friends feasted on "  + foods[foodInput] + " as you watched dolphins jump through the water in front of the setting sun.");
            }
        } 

        // Selected forest
        else if (locationInput == 2){
            if (timeInput == 2 && foodInput == 0) {
                // special case: bear attack
                System.out.println("You went on a picnic in the forest in the evening." +
                                    "\nYou brought " + foods[foodInput] + " for food which attracted a bear!");
            }
            else {
                if (timeInput == 0){
                    System.out.println("You went on a picnic in the forest in the morning" + 
                    "\nYou and your friends had " + foods[foodInput] + " and enjoy the beautiful sunrise.");
                }
                else if (timeInput == 1){
                    System.out.println();
                }
                else {

                }
            }
        } 
        
        // Selected park
        else {
            if (timeInput == 0 && foodInput != 0) {
                // special case: bird attack
                System.out.println("You went on a picnic at the park in the morning." + 
                                    "\nYou brought " + foods[foodInput] +  " which attracted a flock of birds!");
            }
            else {
                if (timeInput == 0){
                    System.out.println("You went on a picnic in the forest, during the evening." +
                                        "\nYou brought " + foods[foodInput] + " for food which attracted a bear!");
                }
                else if (timeInput == 1){
                    System.out.println("You went on a picnic at the park in the afternoon." + 
                                        "\nYou and your friends feasted on " + foods[foodInput] + " as you watched a colony of rabbits hop across the park.");
                }
                else {
                    System.out.println("You went on a picnic at the park in the evening."  + 
                                        "\nYou and your friends feasted on @ + foods[foodsInput] + @ as you watched a flock of birds fly across the setting sun.");
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