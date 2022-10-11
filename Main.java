/*
Choose Your Adventure
Brennan and Cade
10/7/2022
AP Computer Science A Trimester 1 Woldseth

Description: Plan a picnic with your friends
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize variables
        
        Scanner sc = new Scanner(System.in);
        System.out.println();

        String[] choices = {"location", "time", "food"};
        String[] locations = {"beach", "forest", "park"};
        String[] times = {"morning", "afternoon", "evening"};
        String[] foods = {"sandwiches", "fruits", "snacks"};
        
        // Prompt user to choose what they want to plan
        
        System.out.println("\nWhat will you plan?");
        System.out.println("1) " + choices[0]);
        System.out.println("2) " + choices[1]);
        System.out.println("3) " + choices[2]);
        int choiceInput = sc.nextInt();
        int locationInput = 0;
        int timeInput = 0;
        int foodInput = 0;

        // Prompt user to make their plan based on their choice
        // The other choices will have random selections
        
        // Selected location
        if (choiceInput == 1) {
            System.out.println("\nWhere should the picnic be?");
            System.out.println("1) " + locations[0]);
            System.out.println("2) " + locations[1]);
            System.out.println("3) " + locations[2]);
            locationInput = sc.nextInt() - 1;
        } else {
            locationInput = (int) (Math.random() * 3);
        }
        
        // Selected time
        if (choiceInput == 2) {
            System.out.println("\nWhen should the picnic be?");
            System.out.println("1) " + times[0]);
            System.out.println("2) " + times[1]);
            System.out.println("3) " + times[2]);
            timeInput = sc.nextInt() - 1;
        } else {
            timeInput = (int) (Math.random() * 3);
        }

        // Selected food
        if (choiceInput == 3) {
            System.out.println("\nWhat food should be at the picnic?");
            System.out.println("1) " + foods[0]);
            System.out.println("2) " + foods[1]);
            System.out.println("3) " + foods[2]);
            foodInput = sc.nextInt() - 1;
            
        } else {
            foodInput = (int) (Math.random() * 3);
        }

        // Process user and random selections
        // Print a story based on the selections
        
        // testing variables
        timeInput = 2;
        foodInput = 0;
        System.out.println();

        // Selected beach
        if (locationInput == 0){
            if (timeInput == 0){
                System.out.println("You went on a picnic at the beach in the morning." +
                                    "\nYou and your friends feasted on " + foods[foodInput] + " as you watched dolphins jump through the crystal clear waters.");
            }
            else if (timeInput == 1){
                System.out.println("2");
            }
            else if (timeInput == 2){
                System.out.println("You went on a picnic at the beach in the evening." +
                                    "\nYou and your friends feasted on "  + foods[foodInput] + " as you watched dolphins jump through the water in front of the setting sun.");
            }
            // Invalid input
            else {
                System.out.println("Invalid input.");
            }
        } 

        // Selected forest
        else if (locationInput == 1){
            if (timeInput == 2 && foodInput == 0){
                // Special case: Bear attack
                System.out.println("You went on a picnic in the forest in the evening." +
                                    "\nYou brought " + foods[foodInput] + " for food which attracted a bear!");
                
                // Make and process a new decision
                System.out.println("What do you do?");
                System.out.println("1) Run");
                System.out.println("2) Hide");
                System.out.println("3) Attack");
                int newInput = sc.nextInt();

                if (newInput == 1){
                    System.out.println("\nThe bear turns around and you run away, leaving behind your " + 
                                        foods[foodInput] + "to distract the bear.");
                }
                else if (newInput == 2){
                    System.out.println("\nThe bear turns around and you hide in a nearby bush, leaving behind your " +
                                        foods[foodInput] + " to distract the bear.");
                }
                else if (newInput == 3){
                    System.out.println("\nYou walk up to the bear and slap it with your " + foods[foodInput] + ", aggrevating the bear. " + 
                                        "\nYour friends talk you into your senses, and the bear chases you as you run away.");
                }
                // Invalid input
                else {
                    System.out.println("Invalid input.");
                }
            }
            else {
                if (timeInput == 0){
                    System.out.println("You went on a picnic in the forest in the morning" + 
                    "\nYou and your friends had " + foods[foodInput] + " and enjoyed the beautiful sunrise.");
                }
                else if (timeInput == 1){
                    System.out.println("You went on a picnic in the forest in the afternoon" + 
                    "\nYou and your friends had " + foods[foodInput] + " and enjoyed the beautiful sunny skies.");
                }
                else if (timeInput == 2) {
                    System.out.println("You went on a picnic in the forest in the evening" + 
                    "\nYou and your freinds had " + foods[foodInput] + " and enjoyed the beautiful sunset");
                }
                // Invalid input
                else {
                    System.out.println("Invalid input.");
                }
            }
        } 
        
        // Selected park
        else if (locationInput == 2) {
            if (timeInput == 0 && foodInput != 0) {
                // Special case: Bird attack
                System.out.println("You went on a picnic at the park in the morning." + 
                                    "\nYou brought " + foods[foodInput] +  " which attracted a flock of birds!");
                
                // Make and process a new decision
                System.out.println("What do you do?");
                System.out.println("1) Run");
                System.out.println("2) Hide");
                System.out.println("3) Attack");
                int newInput = sc.nextInt();

                if (newInput == 1){
                    System.out.println("You run away as the birds swoop down, leaving behind your " + 
                                        foods[foodInput] + ".");
                }
                else if (newInput == 2){
                    System.out.println("Before the birds swoop down, you cover your " + 
                                        foods[foodInput] + " and yourself with a large blanket.");
                }
                else if (newInput == 3){
                    System.out.println("As the birds swoop down, you and your friends throw your " + 
                                        foods[foodInput] + " at the birds and watch as they fall from the sky.");
                }
                // Invalid input
                else {
                    System.out.println("Invalid input.");
                }
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
                else if (timeInput == 2) {
                    System.out.println("You went on a picnic at the park in the evening."  + 
                                        "\nYou and your friends feasted on " + foods[foodInput] + " as you watched a flock of birds fly across the setting sun.");
                }
                // Invalid input
                else {
                    System.out.println("Invalid input.");
                }
            } 
        }

        // Invalid input
        else {
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}