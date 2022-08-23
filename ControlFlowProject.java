import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ControlFlowProject {
    
    public static void main(String args[]) {
        
        ArrayList<Integer> myList = new ArrayList<>();
        final int maxMagic = 75;
        final int maxNorm = 65;
        boolean continueLoop = true;
        
        Random rand = new Random();
        int randNum1 = rand.nextInt(9) + 1; 
        int randNum2 = rand.nextInt(9) + 1;
        
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();
        
        System.out.println("-------------------------------------------------------");
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
        
        while(continueLoop) {
        
        System.out.println("Do you wish to continue to the interactive portion? ");
        String answer = in.next();
        if (answer.equals("yes") || answer.equals("y")) {
            System.out.println("Do you have a red car (y/n)? ");
            String car = in.next();
            if (car.equals("y")) {
                boolean redCar = true;
            }
            else {
                boolean redCar = false;
            }
            System.out.println("What is the name of your favorite pet? ");
            String petName = in.next();
            myList.add((int) petName.charAt(2)); //first lottery num
            
            System.out.println("What is your pets age? ");
            int age = in.nextInt();
            
            System.out.println("What is your lucky number? ");
            int num = in.nextInt();
            
            int magicNum;
            System.out.println("Do you have a favorite QB? (y/n) ");
            String favQB = in.next();
            if(favQB.equals("y")) {
                System.out.println("What is his number?");
                int numQB = in.nextInt();
                magicNum = numQB * randNum1;
            }
            else {
                magicNum = num * randNum2;
            }
            
            System.out.println("Two-digit Model Year of Car: ");
            int modelYear = in.nextInt();
            myList.add(modelYear + num); //2nd num
            
            System.out.println("First Name of your Favorite actor/actress? ");
            String actor = in.next();
            myList.add((int)actor.charAt(0)); //3rd
            myList.add((int)actor.charAt(actor.length()-1)); //4th
            
            int randNum = -1;
            while (randNum < 1 && randNum >50) {
                System.out.println("Enter a Random Number Between 1-50: ");
                randNum = in.nextInt();
            }
            myList.add(42); //5th
            
            for(int i = 0; i < 5; i++) {
                while (myList.get(i) > maxNorm) {
                    myList.set(i, myList.get(i) - maxNorm);
                }
            }
            
            while (magicNum > maxMagic) {
                magicNum = magicNum - maxMagic;
            }
            
            System.out.println("Lottery Numbers: " + myList.toString().substring(1, myList.toString().length() - 1) + " Magic Number: " + magicNum);
            
            System.out.println("Would you like to play again? (y/n)");
            if(in.next().equals("y")) myList.clear();
            else continueLoop = false;
            
        }
        else {
            System.out.println("Okay, return later to complete the survey");
            System.exit(0);
        }
        
        }
        System.out.println("Thank you!");
        in.close();
    }
    
}