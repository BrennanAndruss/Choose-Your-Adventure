import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("What will you plan?");


        String[] locations = {"beach", "forest", "park"};
        System.out.println("Where should the picnic be?");
        System.out.println("1) " + locations[0]);
        System.out.println("2) " + locations[1]);
        System.out.println("3) " + locations[2]);
        // beach -- dolphin
        // forest -- bears
        // park -- birds
        
        String[] times = {"morning", "afternoon", "evening"};
        System.out.println("When should the picnic be?");
        System.out.println("1) " + times[0]);
        System.out.println("2) " + times[1]);
        System.out.println("3) " + times[2]);
        // morning -- sunrise
        // afternoon -- nothing
        // evening -- sunset

        String[] foods = {"banana", "grapes", "etc"};
        System.out.println("When should the picnic be?");
        System.out.println("1) " + foods[0]);
        System.out.println("2) " + foods[1]);
        System.out.println("3) " + foods[2]);

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
    }
}