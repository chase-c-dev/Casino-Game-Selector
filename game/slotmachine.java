package game;
import util.gameSelector;
import util.slotmachineAnimation;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Slot Machine Game
//Inherits from Game class
public class slotmachine extends game {

    public slotmachine(int score, String name) {
        super(score, name); //super, takes constructor from game class, refers to parent class
    }
    public void initialize (){
        System.out.println("Startup");
    }

    public void slot () throws InterruptedException {
        System.out.println("If all three numbers match, you win");
        System.out.println("------------------------------------------");
        Random random = new Random();
        ArrayList <Integer> prove = new ArrayList<Integer>();
        int max = 9;
        int min = 1;
        slotmachineAnimation slotmachineAnimation = new slotmachineAnimation();
        slotmachineAnimation.animation();
        for (int i = 1; i <= 3; i++) { //forloop runs three times
            int counter = (int) ((Math.random() * (max - min)) + min); //generates a random number between 1 and 9
            prove.add(counter); //adds random numbers to array list
            System.out.print(counter + " "); //prints random numbers
        }
        System.out.println("");
        System.out.println("------------------------------------------\n\n");

        System.out.println("------------------------------------------");
        System.out.println(prove);
        System.out.println("------------------------------------------");


        if (prove.get(0) == prove.get(1) && prove.get(0) == prove.get(2)) { //checks to make sure three numbers are equal
            System.out.println("You Win!!");
        }
        again(); //sees if the user wants to play again, return to menu or exit the game
    }

    public void again() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        System.out.println("type y for yes and n for no?");
        System.out.println("Or type exit to return to game menu");
        String answer = scan.next();
        if (answer.equals("y")) {
            slot(); //runs slotmachine again
        }
        if (answer.equals("n")) {
            System.out.println("Game Over, Good Bye");
        }
        if (answer.equals("exit")) {
            gameSelector gameSelector = new gameSelector();
            gameSelector.startUP(); //runs original game menu to choose another game
        }
    }

}
